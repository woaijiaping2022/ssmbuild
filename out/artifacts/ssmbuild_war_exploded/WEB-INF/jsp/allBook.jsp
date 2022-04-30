<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍</title>

    <%--bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表——————————显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/books/toAddBooks">新增书籍</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/books/allBooks">查询所有书籍</a>
            </div>
            <div class="col-md-8 column">
                <form action="${pageContext.request.contextPath}/books/queryBookName" method="post" style="float : right">
                    <span style="color:red;font-weight: bold">${err}</span>
                    <input type="text" placeholder="请输入要查询的书籍" name="queryBookName">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--书籍从数据库中查询出来，从这个list中遍历出来 : foreach--%>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/books/toUpdatePaper/${book.bookID}">修改</a>
                            &nbsp; | &nbsp;
                            <%--是否确定删除提示 onclick='return confirm("确定要删除吗?")'--%>
                            <a href="${pageContext.request.contextPath}/books/deleteBooks?id=${book.bookID}" onclick='return confirm("确定要删除吗?")'>删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
