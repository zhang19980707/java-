package cn.zskblog.web.servlet;

import java.io.IOException;

@javax.servlet.annotation.WebServlet("/ajaxServlet")
public class AjaxServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // 1、获取请求参数
        String username = request.getParameter("username");
        System.out.println(username);

        // 服务器响应
        response.getWriter().write("hello" + ":" + username);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
