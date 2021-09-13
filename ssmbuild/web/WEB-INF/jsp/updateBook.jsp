<%--
  Created by IntelliJ IDEA.
  User: ZZ
  Date: 2020/8/24
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<c:foreach>查询出来的数据不显示是因为要添加下面内容  就是引入标准标签库的路径（jstl） 一定要加不然404--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>修改书籍</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--       前端传递隐藏域--%>
        <input type="hidden" name="bookID" value="${book.bookID}">
        书籍名称：<input type="text" name="bookName" value="${book.bookName}" required><br><br><br>
        书籍数量：<input type="text" name="bookCounts" value="${book.bookCounts}" required><br><br><br>
        书籍详情：<input type="text" name="detail" value="${book.detail}" required><br><br><br>
        <input type="submit" value="修改">
    </form>

</div>
</body>
</html>
