<%--
  Created by IntelliJ IDEA.
  User: nodirbek
  Date: 19/08/2022
  Time: 07:09
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
<body>
<jsp:include page="../adfragment/admin-nav.jsp"/>
<div class="row">
    <c:forEach items="${allProduct}" var="product">
        <div class="col-2">
            <div class="card mt-5">
                <img src="images/shaytanat.png" class="card-img-top" alt="Book4" width="100">

                <div class="card-body">
                    <p class="card-text">ProductName : ${product.name}</p>
                    <p class="card-text">Price : ${product.price}</p>
                    <p class="card-text">Category : ${product.category.name}</p>
                    <p class="card-text">Title : ${product.title}</p>
                    <p class="card-text">Email : ${product.user.email}</p>
                    <p class="card-text">UserName : ${product.user.username}</p>
                    <p class="card-text">Phone : ${product.user.phoneNumber}</p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
