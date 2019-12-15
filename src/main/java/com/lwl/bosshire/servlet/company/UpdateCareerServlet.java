package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.config.DataSourceUtils;
import com.lwl.bosshire.dao.CareerMapper;
import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.CareerExample;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.utils.ResponseUtils;
import com.lwl.bosshire.utils.UserContext;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 8:25
 */
@Log4j
@WebServlet("/api/company/career/update")
public class UpdateCareerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = UserContext.get();
        if(user == null || user.getRole() != Role.HR.val()) {
            resp.sendError(403);
            return;
        }

        String oper = req.getParameter("oper");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String salaryMin = req.getParameter("salary_min");
        String salaryMax = req.getParameter("salary_max");
        String desc = req.getParameter("desc");

        CareerMapper mapper = DataSourceUtils.getMapper(CareerMapper.class);

        try {
            if ("delete".equals(oper)) {
                int id = Integer.parseInt(req.getParameter("id"));
                mapper.deleteByPrimaryKey(id);
                ResponseUtils.success(resp.getWriter());
                return;
            }

            Career career = Career.builder()
                    .careerName(name)
                    .careerType(Integer.parseInt(type))
                    .careerSalaryMin(salaryMin != null ? Integer.parseInt(salaryMin) : null)
                    .careerSalaryMax(salaryMin != null ? Integer.parseInt(salaryMax) : null)
                    .careerDesc(desc)
                    .build();

            if ("add".equals(oper)) {
                mapper.insertSelective(career);
                ResponseUtils.success(resp.getWriter());
            } else if ("update".equals(oper)) {
                int id = Integer.parseInt(req.getParameter("id"));
                CareerExample ce = new CareerExample();
                ce.createCriteria().andCareerIdEqualTo(id);
                mapper.updateByExampleSelective(career, ce);
                ResponseUtils.success(resp.getWriter());
            } else {
                resp.sendError(403);
            }
            DataSourceUtils.commit();
        } catch (RuntimeException e) {
            log.warn(e);
            DataSourceUtils.rollback();
        } finally {
            DataSourceUtils.close();
        }
    }
}
