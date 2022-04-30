<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>书籍页面</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 38px;
        margin:100px;
        text-align: center;
        line-height: 38px;
        background: deepskyblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
    <h3>
      <a href="${pageContext.request.contextPath}/books/allBooks">进入书籍系统</a>
    </h3>
  </body>
</html>
