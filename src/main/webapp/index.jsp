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
    <h1>hello jsp</h1>
    <hr>

    <a href="/user/hello">aaa</a>
    <a href="/user/test1?msg=你好">test1</a>
    <a href="/user/test2?username=2">test2</a>

    <form action="/user/test3" method="post">
        <input name="username">
        <input name="age">
        <input name="user.uname">
        <input name="user.uage">
        <br>
        <input name="list[0].uname">
        <input name="list[0].uage">
        <input name="map['one'].uname">
        <input name="map['one'].uage">
        <button>submit</button>
    </form>

    <br>

    <form action="/user/test4" method="post">
        <input name="uname">
        <input name="uage">
        <input name="date">
        <button>submit</button>
    </form>

    <br>
    <a href="/user/test5">test55</a>

    <br>
    <a href="/user1/mav">modelAndView</a>
    <a href="/user1/forward">forward</a>
    <a href="/user1/redirect">redirect</a>

    <hr>
    <h2>文件上传</h2>

    <form action="/upload/upload_mvc" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <br>
        <input type="submit" value="Spring MVC上传">
    </form>

    <form action="/upload/upload_old" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <br>
        <input type="submit" value="传统方式上传">
    </form>

    <hr>
    <h2>异常处理</h2>
    <a href="/exception/test1">异常处理请求</a>

    <hr>
    <h2>拦截器</h2>
    <a href="/interceptor/test1">发送请求</a>
</body>
</html>
