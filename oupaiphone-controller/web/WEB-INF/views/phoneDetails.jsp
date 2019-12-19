
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>手机信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
</head>
<body>
    <div  class="container">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>手机链表————显示所有手机信息</h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <a href="${pageContext.request.contextPath}/phone/insert">添加手机</a>
            </div>
        </div>
    </div>

        <div class="row clearfix">
            <div  class="col-md-5 column">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>称号</th>
                        <th>cpu</th>
                        <th>类型</th>
                        <th>像素</th>
                        <th>batter</th>
                        <th>尺寸</th>
                        <th>Resolvingpwer</th>
                        <th>运行内存</th>
                        <th>时间</th>
                        <th>内存</th>

                    </tr>
                    </thead>
                    <c:forEach var="details" items="${phoneList.list}">
                        <tr>
                            <td>${details.phoneId}</td>
                            <td>${details.phoneName}</td>
                            <td>${details.cpu}</td>
                            <td>${details.phoneType}</td>
                            <td>${details.pixel}</td>
                            <td>${details.batter}</td>
                            <td>${details.screensize}</td>
                            <td>${details.resolvingpwer}</td>
                            <td>${details.runningmemory}</td>
                            <td>${details.listdate}</td>
                            <td>${details.rom}</td>

                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <ul class="pagination">
            <li><a href="/phone/list?pageNum=1">首页</a></li>
            <li><a href="/phone/list?pageNum=${phoneList.prePage}">上一页</a></li>
            <c:forEach items="${phoneList.navigatepageNums}" var="p">
                <li> <a href="/phone/list?pageNum=${p}">${p}</a></li>
            </c:forEach>
            <li><a href="/phone/list?pageNum=${phoneList.nextPage}">下一页</a> </li>
            <li><a href="/phone/list?pageNum=${phoneList.pages}">尾页</a></li>
        </ul>
</body>
</html>
