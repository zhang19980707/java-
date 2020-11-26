package cn.zskblog.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.web.servlet                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/20  11:04                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/
@WebServlet("/demo1")
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("-----demo1来了------");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
