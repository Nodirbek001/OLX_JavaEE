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

<h1>Filter</h1>
<div class="row">
    <div class="col-10 offset-1">
        <button type="button" class="btn btn-success" data-toggle="modal" data-target=".bd-example-modal-lg">
            Add Book
        </button>

        <div class="modal fade bd-example-modal-lg" id="exampleModal" tabindex="-1" role="dialog"
             aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add Bok</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form method="post" action="/show/filtr" enctype="multipart/form-data">
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="form-group">
                                        <label for="name">Product Name</label>
                                        <input type="text" name="name" class="form-control" id="name"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="pricemax">Product price max</label>
                                        <input type="number" name="pricemax" class="form-control" id="pricemax"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="pricemin">Product price min</label>
                                        <input type="number" name="pricemin" class="form-control" id="pricemin"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="category">Category</label>
                                        <select class="form-control" id="category" name="category">
                                            <c:forEach items="${categories}" var="category">--%>
                                                <option value="${category.name}">${category.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </div>
</div>

<div class="row">
    <c:forEach items="${all}" var="product">
        <div class="col-2">
            <div class="card mt-5">

                <img src="../images/shaytanat.png" class="card-img-top" alt="Book4" width="317">
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
