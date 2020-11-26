<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/10/29
  Time: 上午 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
     <% String message = exception.getMessage();
        out.print(message);
     %>
</body>
</html>
