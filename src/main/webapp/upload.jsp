<%--
  Created by IntelliJ IDEA.
  User: FLY
  Date: 2021/1/19
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>upload</h1>

    <form action="/upload/upload_mvc" method="post" enctype="multipart/form-data">
        <input type="file" name="upload111">
        <input type="submit" value="Spring MVC上传">
    </form>

    <hr>

    <form action="/upload/upload_old" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input type="submit" value="传统方式上传">
    </form>
</body>
</html>
