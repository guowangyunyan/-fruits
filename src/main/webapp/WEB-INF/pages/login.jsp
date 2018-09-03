<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/8/30
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div id="content">
    <div id="form">
        <h1>用户登录</h1><br>
        <form method="post" id="myform" onsubmit="return validate()" action="/user/login">
            用户名<input type="text" id="username" name="username"><br>
            密码<input type="password" id="password" name="password"><br>
            <input type="submit" value="登录">
            <a href="/user/register">注册</a>
        </form>
        <!-- 显示错误信息-->
        <c:if test="${errorMsg!=null}">${errorMsg}</c:if>
        <!-- 显示提示-->
        <c:if test="${noticeMsg!=null}">${noticeMsg}</c:if>

    </div>


</div>
</body>
<script type="text/javascript">
    function validate() {
        if (document.getElementById("username").value == "") {
            alert("用户名不能为空");
            document.getElementById("username").focus();
            return false;

        } else if (document.getElementById("password").value == "") {
            alert("密码不能为空");
            document.getElementById("password").focus();
            return false;
        }
        return true;
    }

</script>
</html>
