<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表——————————添加书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/books/updateBooks" method="post">

        <input type="hidden" value="${QBook.bookID}" name="bookID">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" class="form-control" name="bookName" id="bookName" value="${QBook.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" id="bookCounts" value="${QBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" class="form-control" name="detail" id="detail" value="${QBook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
