<%@ page import="uz.team.dao.UserDAO" %>
<%@ page import="uz.team.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: baxtiyor
  Date: 8/20/22
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="./adfragment/js.jsp"/>
<jsp:include page="adfragment/head.jsp"/>
<html>
<body class="bg-success p-2 text-dark bg-opacity-50">
<div class="container rounded bg-white mt-5 mb-5">
  <div class="row">
    <div class="col-md-3 border-right">
      <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span class="font-weight-bold">Edogaru</span><span class="text-black-50">edogaru@mail.com.my</span><span> </span></div>
    </div>
    <div class="col-md-5 border-right">
      <div class="p-3 py-5">
        <div class="d-flex justify-content-between align-items-center mb-3">
          <h4 class="text-right">Profile Settings</h4>
        </div>
<%--        <div class="row mt-2">--%>
<%--          <div class="col-md-6"><label class="labels">Name</label><input type="text" class="form-control" placeholder="first name" value=""></div>--%>
<%--          <div class="col-md-6"><label class="labels">Surname</label><input type="text" class="form-control" value="" placeholder="surname"></div>--%>
<%--        </div>--%>
        <div class="row mt-3">
         <c ${User} var="user">
          <div class="col-md-12"><label class="labels">F.I.O</label><input type="text" class="form-control" placeholder="${user.id}" value=""></div>
          <div class="col-md-12"><label class="labels">Phone Number</label><input type="number" class="form-control" placeholder="enter address line 1" value=""></div>
          <div class="col-md-12"><label class="labels">Email</label><input type="email" class="form-control" placeholder="enter address line 2" value=""></div>
          <div class="col-md-12"><label class="labels">Username</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>
          <div class="col-md-12"><label class="labels">Password</label><input type="number" class="form-control" placeholder="enter address line 2" value=""></div>
         </c>
<%--          <div class="col-md-12"><label class="labels">Area</label><input type="text" class="form-control" placeholder="enter address line 2" value=""></div>--%>
<%--          <div class="col-md-12"><label class="labels">Email ID</label><input type="text" class="form-control" placeholder="enter email id" value=""></div>--%>
<%--          <div class="col-md-12"><label class="labels">Education</label><input type="text" class="form-control" placeholder="education" value=""></div>--%>
<%--        </div>--%>
<%--        <div class="row mt-3">--%>
<%--          <div class="col-md-6"><label class="labels">Country</label><input type="text" class="form-control" placeholder="country" value=""></div>--%>
<%--          <div class="col-md-6"><label class="labels">State/Region</label><input type="text" class="form-control" value="" placeholder="state"></div>--%>
<%--        </div>--%>
        <div class="mt-5 text-center"><button href ="/" class="btn btn-primary profile-button" type="button">Save Profile</button></div>
<%--      </div>--%>
<%--    </div>--%>
<%--    <div class="col-md-4">--%>
<%--      <div class="p-3 py-5">--%>
<%--        <div class="d-flex justify-content-between align-items-center experience"><span>Edit Experience</span><span class="border px-3 p-1 add-experience"><i class="fa fa-plus"></i>&nbsp;Experience</span></div><br>--%>
<%--        <div class="col-md-12"><label class="labels">Experience in Designing</label><input type="text" class="form-control" placeholder="experience" value=""></div> <br>--%>
<%--        <div class="col-md-12"><label class="labels">Additional Details</label><input type="text" class="form-control" placeholder="additional details" value=""></div>--%>
<%--      </div>--%>
<%--    </div>--%>

  </div>

</div>
</div>
</div>
</div>
</body>
<%--body {--%>
<%--background: rgb(99, 39, 120)--%>
<%--}--%>

<%--.form-control:focus {--%>
<%--box-shadow: none;--%>
<%--border-color: #BA68C8--%>
<%--}--%>

<%--.profile-button {--%>
<%--background: rgb(99, 39, 120);--%>
<%--box-shadow: none;--%>
<%--border: none--%>
<%--}--%>

<%--.profile-button:hover {--%>
<%--background: #682773--%>
<%--}--%>

<%--.profile-button:focus {--%>
<%--background: #682773;--%>
<%--box-shadow: none--%>
<%--}--%>

<%--.profile-button:active {--%>
<%--background: #682773;--%>
<%--box-shadow: none--%>
<%--}--%>

<%--.back:hover {--%>
<%--color: #682773;--%>
<%--cursor: pointer--%>
<%--}--%>

<%--.labels {--%>
<%--font-size: 11px--%>
<%--}--%>

<%--.add-experience:hover {--%>
<%--background: #BA68C8;--%>
<%--color: #fff;--%>
<%--cursor: pointer;--%>
<%--border: solid 1px #BA68C8--%>
<%--}--%>
</html>
