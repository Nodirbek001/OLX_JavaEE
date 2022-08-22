<%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/5/22
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="js.jsp"/>
<nav class="navbar navbar-expand-lg bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/user/main-page" style="color: red">Main</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="/category" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Category
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">


                        <select class="form-control" id="category" name="category" style="background: darkslategrey">
                            <c:forEach items="${categories}" var="category">
                                <div class="col-2">
                                    <p class="card-text">Category ${category.id}: ${category.name}</p>
                                </div>
                            </c:forEach>
                        </select>

<%--                        <li><a class="dropdown-item" href="/electronics" style="color: red">Electronics</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/house" style="color: red">House</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/for_business" style="color: red">For Business</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/works" style="color: red">Works</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/animals" style="color: red">Animals</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/transports" style="color: red">Transports</a></li>--%>
<%--                        <li><a class="dropdown-item" href="/for_children" style="color: red">For children</a></li>--%>
                    </ul>
                </li>



                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="/my_profile" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        My Profile
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">
                        <li><a class="dropdown-item" href="/show/profile" style="color: red">My profile</a></li>
<%--                        <li><a class="dropdown-item" href="/edit/profile" style="color: red">Edit profile</a></li>--%>
                    </ul>
                </li>

                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="#" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        Basket
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">
                        <li><a class="dropdown-item" href="/basket/mybasket" style="color: red">My basket</a></li>
                        <li><a class="dropdown-item" href="/basket/history" style="color: red">Shopping history</a></li>
                    </ul>
                </li>


            </ul>
            <ul class="navbar-nav">
                <c:choose>
                    <c:when test="${loggedId}">
                        <li class="nav-item">
                            <a href="/auth/login" class="nav-link" style="color: red">Login</a>
                        </li>
                        <li class="nav-item">
                            <a href="/auth/register" class="nav-link" style="color: red">Register</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a href="/auth/logout" class="nav-link" style="color: red">Logout</a>
                        </li>
                    </c:otherwise>
                </c:choose>
<%--            </ul>--%>
<%--            <ul class="navbar-nav">--%>
<%--                <c:choose>--%>
<%--                    <c:when test="${!isEnter}">--%>
<%--                        <li class="nav-item">--%>
<%--                            <a href="/login/sign-in" class="nav-link" style="color: red">Sign in</a>--%>
<%--                        </li>--%>
<%--                        <li class="nav-item">--%>
<%--                            <a href="/login/sign-up" class="nav-link" style="color: red">Sign up</a>--%>
<%--                        </li>--%>
<%--                    </c:when>--%>
<%--                    <c:otherwise>--%>
<%--                        <li class="nav-item">--%>
<%--                            <a href="/login/logout" class="nav-link" style="color: red">Logout</a>--%>
<%--                        </li>--%>
<%--                    </c:otherwise>--%>
<%--                </c:choose>--%>
<%--            </ul>--%>

        </div>
    </div>
</nav>
