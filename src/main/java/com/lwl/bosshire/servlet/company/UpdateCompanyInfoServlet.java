package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.config.DataSourceUtils;
import com.lwl.bosshire.dao.CompanyMapper;
import com.lwl.bosshire.pojo.Company;
import com.lwl.bosshire.pojo.CompanyExample;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.utils.UserContext;
import lombok.extern.log4j.Log4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.lwl.bosshire.common.ResponseMessage.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.14 20:17
 */
@Log4j
@WebServlet("/api/company/info/update")
public class UpdateCompanyInfoServlet extends HttpServlet {

    private static final SimpleDateFormat EST_DATE_FORMAT = new SimpleDateFormat("yyyy-MM");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = UserContext.get();
        if(user == null || user.getRole() != Role.HR.val()) {
            resp.sendError(403);
            return;
        }

        String name = req.getParameter("name");
        String logo = req.getParameter("logo");
        String emp = req.getParameter("emp");
        String sdesc = req.getParameter("simple_desc");
        String desc = req.getParameter("desc");
        String address = req.getParameter("address");
        String est = req.getParameter("est_time");

        Company c;
        try {
            c = Company.builder()
                    .companyName(name)
                    .companyLogoImage(logo)
                    .companyEmpNum(emp != null ? Integer.parseInt(emp) : null)
                    .companyAddress(address)
                    .companySimpleDesc(sdesc)
                    .companyDesc(desc)
                    .companyEstablishedTime(EST_DATE_FORMAT.parse(est))
                    .build();
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        try {
            CompanyMapper cm = DataSourceUtils.getMapper(CompanyMapper.class);
            CompanyExample ce = new CompanyExample();
            ce.createCriteria().andCompanyUidEqualTo(user.getUserId());
            int cnt = cm.countByExample(ce);
            if (cnt == 0) {
                cm.updateByExampleSelective(c, ce);
            } else {
                cm.insertSelective(c);
            }
            DataSourceUtils.commit();
        } catch (RuntimeException e) {
            log.error(e);
            DataSourceUtils.rollback();
            resp.sendError(500);
            return;
        } finally {
            DataSourceUtils.close();
        }

        resp.getWriter().write(buildString(0, "SUCCESS"));
    }
}
