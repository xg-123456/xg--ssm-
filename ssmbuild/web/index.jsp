<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/9/11
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;

      }
      h3{
        width: 180px;
        height: 30px;
        margin: 100px auto;
        text-align: center;
        line-height: 30px;
        background: aqua;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>
  </h3>
  </body>
</html>
