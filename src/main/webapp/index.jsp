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
    <a href="/user/hello">aaa</a>
    <a href="/user/test1">test1</a>
    <a href="/user/test2?username">test2</a>
    <a href="/user/test3">test3</a>

    <form action="/user/test2" method="post">
        <input name="username">
        <button>submit</button>
    </form>
</body>
</html>
