package com.lwl.bosshire.servlet.company;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.dao.CareerMapper;
import com.lwl.bosshire.dao.CompanyMapper;
import com.lwl.bosshire.pojo.*;
import com.lwl.bosshire.utils.UserContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.utils.CommonUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 15:32
 * 获取当前公司职位列表
 */
@WebServlet("/api/company/career/list")
public class CareerListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = UserContext.get();
        if(user == null || user.getRole() != Role.HR.val()) {
            resp.sendError(403);
            return;
        }

        CompanyMapper companyMapper = getMapper(CompanyMapper.class);
        CompanyExample ce = new CompanyExample();
        ce.createCriteria().andCompanyUidEqualTo(user.getUserId());
        Company company = getFirst(companyMapper.selectByExample(ce));

        if(company == null) {
            return;
        }

        CareerMapper careerMapper = getMapper(CareerMapper.class);
        CareerExample cae = new CareerExample();
        cae.createCriteria().andCareerCompanyIdEqualTo(company.getCompanyId());
        List<Career> career = careerMapper.selectByExample(cae);


    }
}
