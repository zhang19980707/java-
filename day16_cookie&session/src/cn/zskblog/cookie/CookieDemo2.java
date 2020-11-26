package cn.zskblog.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
     cookie快速入门：
 */
@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 3、获取Cookie对象
        Cookie[] cookies = request.getCookies();
        // 4、获取数据，遍历Cookies数组
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.print(cookie.getName());
                System.out.println(cookie.getValue());
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
