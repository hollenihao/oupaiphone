
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登入</title>
    <link href="https://cdn.bootcss.com/font-awesome/5.10.0-12/css/all.min.css" rel="stylesheet">
    <link href="static/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>


<form method="post" action="/login">
    <h3>欧派手机管理系统登录</h3>
    <div class="ib">
        <input id="uName" name="uName" onclick="dispare()"/>
        <span data-placeholder="请输入账号"></span><span style="color: red" >${uNameError}</span>
    </div>
    <div class="ib">
        <input id="uPassword" name="uPassword" type="password" />
        <span data-placeholder="请输入密码"></span><span style="color: red" >${uPasswordError}</span>
    </div>
<%--  隐藏域  --%>
    <input type="hidden" name="back_url" value="">

    <button type="submit" value="登入" id="loginbtn">点击登录</button>
    <div id="tishi">
        <span style="color: red">${error} <br>${uNameError}${uPasswordError}</span>
    </div>
</form>

<script>
    function dispare() {
        var tishi =document.getElementById("tishi");
        tishi.style.display="none";
    }
</script>

<script>

    window.onload = function (ev) {
        var nodeListOf = document.querySelectorAll("input");
        nodeListOf.forEach(function (o) {
            o.onfocus = function (ev) {
                ev.target.classList.add("focus");
            };
            o.onblur = function (ev) {
                if (!ev.target.value) {
                    ev.target.classList.remove("focus");
                }
            }
        });
    };
</script>
</body>
</html>
