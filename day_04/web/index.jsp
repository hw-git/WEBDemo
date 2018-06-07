<%--
  Created by IntelliJ IDEA.
  User: huwei
  Date: 2018/6/7
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="/requestDemo?username=张三&password=123456">requestDemo</a>
    <%--action 表示表单提交的url   menthod  表示表单的请求方式--%>
    <form action="/requestDemo" method="POST">
        username : <input type="text" name="username" value=""><br><br>
        username : <input type="text" name="username" value=""><br><br>
        password : <input type="password" name="password" value=""><br><br>
        <input type="submit" value="提交">
    </form>
  </body>
</html>
