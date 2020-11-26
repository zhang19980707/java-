package cn.zskblog.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.web.servlet                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/17  21:55                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/
/*
    Servlet入门
 */
public class ServletDemo1 implements Servlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 提供服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse
            servletResponse) throws ServletException, IOException {
        System.out.println("hello Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
