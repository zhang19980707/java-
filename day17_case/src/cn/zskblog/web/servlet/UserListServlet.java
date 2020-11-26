package cn.zskblog.web.servlet;

import cn.zskblog.domain.User;
import cn.zskblog.service.UserService;
import cn.zskblog.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1、调用service完成查询
        UserService service = new UserServiceImpl();
        List<User> users = service.findAll();
        // 2、将list存入request域
        request.setAttribute("users", users);
        // 3、转发到list页面、
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
