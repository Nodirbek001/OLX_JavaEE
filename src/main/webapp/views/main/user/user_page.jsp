<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/5/22
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<div class="row">


    <c:forEach items="${products}" var="product">
        <div class="col-2">
            <div class="card mt-5">
                <img src="/home/baxtiyor/Pictures/1.png" class="card-img-top" alt="${product.name}" width="100">

                <div class="card-body">
                    <p class="card-text">Product_name : "${product.name}"</p>
                    <p class="card-text">Category : ${product.category.name}</p>
                    <p class="card-text">Title : ${product.title}</p>
                    <p class="card-text">Price : ${product.price}</p>
                </div>
            </div>
        </div>
        <button type="button" class="btn btn-info offset-1" >Add Basket</button>
    </c:forEach>

</div>

</body>
</html>
