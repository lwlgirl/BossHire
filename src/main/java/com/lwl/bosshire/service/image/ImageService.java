package com.lwl.bosshire.service.image;

import com.lwl.bosshire.common.ServiceResponse;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 9:07
 */
public interface ImageService {

    ServiceResponse<String> upload(InputStream is, String contentType);

    ServiceResponse<String> download(String name, OutputStream os);

    static ImageService getInstance(String uploadPath) {
        return new ImageServiceImpl(uploadPath);
    }

}
