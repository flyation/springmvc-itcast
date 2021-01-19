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

    <hr>

    <form action="/user/test4" method="post">
        <input name="uname">
        <input name="uage">
        <input name="date">
        <button>submit</button>
    </form>

    <hr>
    <a href="/user/test5">test55</a>

</body>
</html>
