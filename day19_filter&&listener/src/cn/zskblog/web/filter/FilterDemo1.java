package cn.zskblog.web.filter;

import javax.servlet.*;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.web.filter                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/11/03  09:49                                
 * Version: 1.0                                                              
 * Description:
 *       过滤器快速入门
*****************************************************************************/
//@WebFilter("/*")   // 访问所有资源之前都被该过滤器拦截，执行过滤器
public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse
            servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo1被执行了！");
        filterChain.doFilter(servletRequest,servletResponse); // 放行
    }

    @Override
    public void destroy() {

    }
}
