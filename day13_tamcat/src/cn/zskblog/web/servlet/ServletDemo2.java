package cn.zskblog.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.web.servlet                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/20  06:25                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/

public class ServletDemo2 implements Servlet {
    /*
      初始化方法：在servlet创建时被执行该方法，只会执行一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("-----init----");
    }

    /*
     servlet的配置对象
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
      每一次servlet被访问执行一次，可以执行多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("-----service-----");
    }

    // 获取Service的一些信息，版本，作者等
    @Override
    public String getServletInfo() {
        return null;
    }

    /*
      在servlet被杀死时执行(在服务器正常关闭时执行，只执行一次)
     */
    @Override
    public void destroy() {
        System.out.println("------stop------");
    }
}
