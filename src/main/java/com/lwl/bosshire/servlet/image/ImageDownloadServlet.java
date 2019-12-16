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
import java.util.Properties;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 9:42
 */
@WebServlet(value = "/image/upload", initParams = {
        @WebInitParam(name = "image-properties-path", value = "image.properties")
})
public class ImageDownloadServlet extends HttpServlet {

    private ImageService imageService;

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
        } catch (IOException | NumberFormatException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        if(name == null) {
            resp.sendError(400);
            return;
        }

        ServiceResponse<String> res = imageService.download(name, resp.getOutputStream());
        if(res.isSuccess()) {
            resp.setContentType(resp.getContentType());
        } else {
            if(res.code() > 0) {
                resp.sendError(404);
            } else {
                resp.sendError(500);
            }
        }
    }
}
