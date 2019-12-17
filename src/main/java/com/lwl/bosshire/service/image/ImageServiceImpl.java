package com.lwl.bosshire.service.image;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.ImageMapper;
import com.lwl.bosshire.pojo.Image;
import lombok.extern.log4j.Log4j;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.UUID;

import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.config.DataSourceUtils.*;
/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 9:07
 */
@Log4j
class ImageServiceImpl implements ImageService {

    private final File uploadPath;

    ImageServiceImpl(String uploadPath) {
        this.uploadPath = new File(uploadPath);
    }

    @Override
    public ServiceResponse<String> upload(InputStream is, String contentType) {
        String name = generalName();
        ImageMapper mapper = getMapper(ImageMapper.class);
        Image image = new Image();
        image.setImageId(name);
        image.setContentType(contentType);
        image.setPath(name);

        try {
            mapper.insert(image);
        } catch (RuntimeException e) {
            rollback();
            return failure(-1);
        }

        File path = new File(uploadPath, name);
        try(FileOutputStream fos = new FileOutputStream(path)) {
            IOUtils.copy(is, fos);
            commit();
            return success(name);
        } catch (IOException e) {
            log.error(e);
            rollback();
            return failure(-2);
        }
    }

    @Override
    public ServiceResponse<String> download(String name, OutputStream os) {
        ImageMapper mapper = getMapper(ImageMapper.class);
        Image image = mapper.selectByPrimaryKey(name);
        if(image == null) {
            return failure(1);
        }

        File path = new File(uploadPath, image.getPath());
        try(FileInputStream fis = new FileInputStream(path)) {
            IOUtils.copy(fis, os);
            return success(image.getContentType());
        } catch (IOException e) {
            return failure(-1);
        }
    }

    private static String generalName() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
