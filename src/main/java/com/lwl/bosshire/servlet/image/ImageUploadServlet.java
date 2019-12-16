package com.lwl.bosshire.servlet.image;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.service.image.ImageService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import static com.lwl.bosshire.utils.ResponseUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 0:02
 */
@WebServlet(value = "/api/image/upload", initParams = {
    @WebInitParam(name = "image-properties-path", value = "image.properties")
})
public class ImageUploadServlet extends HttpServlet {

    private ImageService imageService;

    private int uploadMaxLength;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String path = config.getInitParameter("image-properties-path");
        if(path == null) {
            throw new ServletException("image-properties-path");
        }

        try(InputStream is = getClass().getClassLoader().getResourceAsStream("image.properties")) {
            Properties p = new Properties();
            p.load(is);
            String uploadPath = p.getProperty("image.upload.path");
            if(uploadPath == null) {
                throw new ServletException("image.upload.path is null.");
            }
            this.imageService = ImageService.getInstance(uploadPath);
            this.uploadMaxLength = Integer.parseInt(p.getProperty("image.upload.size"));
        } catch (IOException | NumberFormatException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(req.getContentLength() > uploadMaxLength) {
            resp.sendError(403);
            return;
        }

        ServiceResponse<String> res = imageService.upload(req.getInputStream(), req.getContentType());
        PrintWriter pw = resp.getWriter();
        if(res.isSuccess()) {
            success(res.data(), pw);
        } else {
            failure(res.code(), pw);
        }
    }
}
