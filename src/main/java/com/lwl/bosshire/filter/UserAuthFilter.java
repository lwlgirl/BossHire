package com.lwl.bosshire.filter;

import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.utils.UserContext;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.14 21:51
 */
@WebFilter
public class UserAuthFilter implements Filter {

    @Override
    public void init(FilterConfig config) { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        UserContext.set((User) req.getSession().getAttribute(UserContext.USER_KEY));
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() { }
}
