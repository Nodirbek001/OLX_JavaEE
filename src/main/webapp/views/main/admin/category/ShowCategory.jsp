<%--
  Created by IntelliJ IDEA.
  User: nodirbek
  Date: 19/08/2022
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../adfragment/head.jsp"/>
</head>
<body class="bg-success p-2 text-dark bg-opacity-50">
<jsp:include page="../adfragment/admin-nav.jsp"/>
<div class="row">
    <div class="col-6 offset-3">
        <c:forEach items="${categories}" var="category">
            <div class="col-2">
                    <p class="card-text">Category ${category.id}: ${category.name}</p>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>

