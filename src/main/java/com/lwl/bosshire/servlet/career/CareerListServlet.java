package com.lwl.bosshire.servlet.career;

import com.lwl.bosshire.dao.CareerMapper;
import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.CareerExample;
import com.lwl.bosshire.vo.CareerListVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.common.ResponseMessage.buildString;

@WebServlet("/api/career/list")
public class CareerListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CareerMapper mapper = getMapper(CareerMapper.class);
        CareerExample ce = new CareerExample();
        List<Career> list = mapper.selectByExample(ce);
        resp.getWriter().write(buildString(0, "SUCCESS", new CareerListVo(list)));
    }

}
