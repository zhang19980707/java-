package cn.zskblog.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo1")
public class requestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();  // 1、获取请求方式
        System.out.println(method); // GET
        String contextPath = request.getContextPath(); // 2、获取虚拟目录
        System.out.println(contextPath); //   /day14
        String servletPath = request.getServletPath(); // 3、获取Servlet路径
        System.out.println(servletPath);  //  /requestDemo1
        String queryString = request.getQueryString(); // 4、获取get方式请求参数
        System.out.println(queryString);// null
        String requestURI = request.getRequestURI(); // 5、获取请求URI
        StringBuffer requestURL = request.getRequestURL();// 获取请求URL
        System.out.println(requestURI); // /day14/requestDemo1
        System.out.println(requestURL); //  http://localhost/day14/RequestDemo1
        String protocol = request.getProtocol(); // 6、获取请求协议
        System.out.println(protocol); // HTTP/1.1
        String remoteAddr = request.getRemoteAddr(); // 7、获取客户机IP
        System.out.println(remoteAddr); // 0:0:0:0:0:0:0:1
    }
}
