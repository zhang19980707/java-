package cn.zskblog.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/****************************************************************************
 * Package:cn.zskblog.web.servlet                                                                                        
 * Author:ZhangShiKang                                                       
 * Email: 845664960@qq.com                                                       
 * Created: 2020/10/20  11:07                                
 * Version: 1.0                                                              
 * Description:                                                              
*****************************************************************************/
@WebServlet("/demo2")
public class ServletDemo2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse
            servletResponse) throws ServletException, IOException {
        System.out.println("---demo2来了----");
    }
}
