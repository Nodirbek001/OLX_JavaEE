<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/22/22
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../adfragment/head.jsp"/>
</head>
<body>

<div class="row">


    <c:forEach items="${basket}" var="basket">
        <div class="col-2">
            <div class="card mt-5">
                <img src="/home/baxtiyor/Pictures/1.png" class="card-img-top" alt="${basket.name}" width="100">

                <div class="card-body">
                    <p class="card-text">Product_name : "${basket.name}"</p>
                    <p class="card-text">Category : ${basket.price}</p>
                </div>
            </div>
        </div>
<%--        <button type="submit" class="btn btn-success">Login</button>--%>
        <a href="/basket/mybasket" class="btn btn-primary">Remove from Basket</a>
    </c:forEach>
</div>

</body>
</html>
