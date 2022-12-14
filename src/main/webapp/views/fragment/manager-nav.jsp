<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="js.jsp"/>
<nav class="navbar navbar-expand-lg bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/director/main-page" style="color: red">Main</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="/manager/airport/main" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Flight
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">
                        <li><a class="dropdown-item" href="/add/flight" style="color: red">Add flight</a></li>
                        <li><a class="dropdown-item" href="/show/flight" style="color: red">Show flight</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="/manager/airport/main" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Users
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">
                        <li><a class="dropdown-item" href="#" style="color: red">Add airport</a></li>
                        <li><a class="dropdown-item" href="#" style="color: red">Show airports</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle" style="color: red" href="/manager/airport/main" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Profile
                    </a>
                    <ul class="dropdown-menu" style="background: darkgray">
                        <li><a class="dropdown-item" href="/edit/profil" style="color: red">Edit profil</a></li>
                        <li><a class="dropdown-item" href="/show/profil" style="color: red">Show profil</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="navbar-nav">
                <c:choose>
                    <c:when test="${!isEnter}">
                        <li class="nav-item">
                            <a href="/login/sign-in" class="nav-link" style="color: red">Sign in</a>
                        </li>
                        <li class="nav-item">
                            <a href="/login/sign-up" class="nav-link" style="color: red">Sign up</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a href="/login/logout" class="nav-link" style="color: red">Logout</a>
                        </li>
                    </c:otherwise>
                </c:choose>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>