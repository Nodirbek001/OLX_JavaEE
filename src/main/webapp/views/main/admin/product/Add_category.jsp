<%--
  Created by IntelliJ IDEA.
  User: nodirbek
  Date: 06/08/2022
  Time: 07:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../adfragment/head.jsp"/>
</head>
<body class="bg-success p-2 text-dark bg-opacity-50">
<jsp:include page="../adfragment/admin-nav.jsp"/>
<br><br><br><br>
<h1>MAIN PAGE</h1>
<div class="row">
    <div class="col-6 offset-3">
        <form method="post">
            <%--@declare id="exampleinputemail1"--%>
            <div class="form-group">
                <label for="category">Category Name</label>
                <input type="text" name="category" class="form-control" id="category"/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
