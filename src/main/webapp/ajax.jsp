<%--
  Created by IntelliJ IDEA.
  User: FLY
  Date: 2021/1/24
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.8.3.min.js"></script>
    <script>
        $(function () {
            $('#btn').click(function () {
                $.ajax({
                    type: 'post',
                    url: '/user1/ajax',
                    contentType: 'application/json;charset=UTF-8',
                    data: '{"uname":"hehe", "uage": 30}',
                    dataType: 'json',
                    success: function (data) {
                        console.log(data)
                        alert('success!' + data)
                    },
                    complete: function () {
                        alert('complete!')
                    }
                })
            })
        })
    </script>
</head>
<body>
    <button id="btn">ajax</button>
</body>
</html>
