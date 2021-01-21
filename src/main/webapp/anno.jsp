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
    <a href="/anno/t1?name1=哈哈">t1</a>

    <form action="/anno/t2" method="post">
        <input name="username">
        <input name="age">
        <button>submit</button>
    </form>

    <a href="/anno/t3/10">t3</a>

    <a href="/anno/t5">t5</a>

    <a href="/anno/t6">t6</a>

    <form action="/anno/t7" method="post">
        <input name="uname">
        <input name="uage">
        <button>submit</button>
    </form>

    <a href="/anno/t8">t8</a>
    <a href="/anno/t8_1">t8_1</a>
    <a href="/anno/t8_2">t8_2</a>

</body>
</html>
