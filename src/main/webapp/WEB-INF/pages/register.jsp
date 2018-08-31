<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/8/31
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div id="content">
    <div id="form">
        <h1>用户注册</h1><br>
        <form method="post" id="myform" onsubmit="return validate()" action="/user/register">
            用户名<input type="text" id="username" name="username"><br>
            密码<input type="password" id="password" name="password"><br>
            姓名<input type="text" id="name" name="name"><br>
            手机号<input type="text" id="telephone" name="telephone"><br>
            <input type="submit" value="注册"><a href="/user/login">返回登录</a>

        </form>
        <!-- 显示错误信息-->
        <c:if test="${errorMsg!=null}">${errorMag}</c:if>
    </div>
</div>


</div>


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
        } else if (document.getElementById("name").value == "") {
            alert("姓名不能为空");
            document.getElementById("name").focus();
            return false;
        } else if (document.getElementById("telephone").value == "" || !(/^1[3,5,8]\d{9}$/.test(document.getElementById("telephone").value))) {
            alert("手机格式有误");
            document.getElementById("telephone").focus();
            return false;
        }
        return true;
    }


</script>

</body>
</html>
