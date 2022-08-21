<%--
  Created by IntelliJ IDEA.
  User: jl
  Date: 7/29/2022
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../fragment/head.jsp"/>
<body class="bg-success p-2 text-dark bg-opacity-50">
<div class="row" >
  <div class="col-6 offset-3">
    <form method="post">
      <div class="form-group">
        <label for="fullName">F.I.O</label>
        <input type="text" class="form-control" id="fullName" name="fullName" placeholder="F.I.O" >
      </div>
      <div class="form-group">
        <label for="phoneNumber">Phone Number</label>
        <input type="number" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="+9989********" >
      </div>
      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="email@gmail.com" >
      </div>
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="John Doe">
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" name="password">
      </div>
      <div class="form-group">
        <label for="confirmPassword">Confirm Password</label>
        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
      </div>

      <button type="submit" class="btn btn-success">Register</button>
      <a href="/auth/login" class="btn btn-primary">Login</a>
    </form>
  </div>
</div>
<jsp:include page="../fragment/js.jsp"/>
</body>
</html>