<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/5/22
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="adfragment/head.jsp"/>
</head>
<body class="bg-success p-2 text-dark bg-opacity-50">
<jsp:include page="adfragment/user-nav.jsp"/>
<br><br><br><br>
<div class="col-4 offset-4">
    <form class="d-flex"  role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
</div>

</body>
<jsp:include page="adfragment/js.jsp"/>
</html>
