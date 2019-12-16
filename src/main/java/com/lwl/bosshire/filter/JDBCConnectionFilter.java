package com.lwl.bosshire.filter;

import com.lwl.bosshire.config.DataSourceUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 19:30
 */
@WebFilter("/*")
public class JDBCConnectionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if(DataSourceUtils.isOpen()) {
            DataSourceUtils.close();
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() { }
}
