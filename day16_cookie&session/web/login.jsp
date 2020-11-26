<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/10/28
  Time: 下午 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="500jsp" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function () {
            document.getElementById("img").onclick = function () {
                var time = new Date().getTime();
                this.src = "/day16/checkCodeServlet?time=" + time;
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
<form action="/day16/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>
            <td colspan="2"><img src="/day16/checkCodeServlet" alt="" id="img"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>

<div><%=request.getAttribute("cc_error") == null? "":request.getAttribute("cc_error") %></div>
<div><%=request.getAttribute("login_error") == null? "" :request.getAttribute("login_error")%></div>

</body>
</html>
