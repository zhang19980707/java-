package cn.zskblog.web.filter;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo2 implements Filter {

    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("FilterDemo2被执行了！");
        chain.doFilter(req, resp);
        System.out.println("程序回到了filter中");
        
    }

    public void destroy() {
    }

}
