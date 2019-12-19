
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String appPath = request.getContextPath(); %>

<html>
<head>
    <title>用户</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <link href="/static/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet"/>
        </head>
<body>
    <table class="table">
<tr>
    <th>用户名</th>
    <th>密码</th>
    <th>状态</th>
</tr>
        <c:forEach items="${lists.list}" var="userList">
<tr>
    <td>${userList.UName}</td>
    <td>${userList.UPassword}</td>
    <td>${userList.UStatus}</td>
</tr>
        </c:forEach>
    </table>
<ul class="pagination">
<li><a href="/index?pageNum=1">首页</a></li>
    <li><a href="/index?pageNum=${list.prePage}">上一页</a> </li>
    <c:forEach items="${list.navigatepageNums}" var="p">
<li><a href="/index?pageNum=${p}">${p}</a></li>
    </c:forEach>
    <li><a href="/index?pageNum=${list.nextPage}">下一页</a></li>
    <li><a href="/index?pageNum=${list.pages}">尾页</a></li>
</ul>






<%--    <div class="container">--%>
<%--        <div class="row clearfix">--%>
<%--            <div class="col-md-12 column">--%>
<%--                <div class="page-header">--%>
<%--                    <h1>--%>
<%--                        基于SSM框架的管理系统：简单实现增、删、改、查。--%>
<%--                    </h1>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="row clearfix">--%>
<%--            <div class="col-md-12 column">--%>
<%--                <div class="page-header">--%>
<%--                    <h1>--%>
<%--                        <small>用户列表 —— 显示所有用户</small>--%>
<%--                    </h1>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row">--%>
<%--            <div class="col-md-4 column">--%>
<%--                <a class="btn btn-primary" href="${path}/toAddUser">新增</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row clearfix">--%>
<%--            <div class="col-md-12 column">--%>
<%--                <table class="table table-hover table-striped">--%>
<%--                    <thead>--%>
<%--                    <tr>--%>
<%--                        <th>用户编号</th>--%>
<%--                        <th>用户名字</th>--%>
<%--                        <th>用户密码</th>--%>
<%--                        <th>操作</th>--%>
<%--                    </tr>--%>
<%--                    </thead>--%>
<%--                    <tbody>--%>
<%--                    <c:forEach var="user" items="${requestScope.get('list')}" varStatus="status">--%>
<%--                        <tr>--%>
<%--                            <td>${user.id}</td>--%>
<%--                            <td>${paper.paperName}</td>--%>
<%--                            <td>${paper.paperNum}</td>--%>
<%--                            <td>${paper.paperDetail}</td>--%>
<%--                            <td>--%>
<%--                                <a href="${path}/paper/toUpdatePaper?id=${paper.paperId}">更改</a> |--%>
<%--                                <a href="<%=appPath%>/paper/del/${paper.paperId}">删除</a>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                    </c:forEach>--%>
<%--                    </tbody>--%>
<%--                </table>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
</body>

</html>
