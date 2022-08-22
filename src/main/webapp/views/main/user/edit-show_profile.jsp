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
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5"
                                                                                         width="150px"
                                                                                         src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span
                    class="font-weight-bold">Edogaru</span><span
                    class="text-black-50">edogaru@mail.com.my</span><span> </span></div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Profile Settings</h4>
                </div>

                <div class="row mt-3">
                    <c ${User} var="user">
                        <div class="form-group">
                            <label for="userid">F.I.O</label>
                            <input id="userid" type="text" class="form-control" placeholder="${user.id}" value=""></div>
                        <div class="form-group">
                            <label for="phone">Phone Number</label>
                            <input id="phone" type="number" class="form-control" placeholder="enter address line 1"
                                   value=""></div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input id="email" type="email" class="form-control" placeholder="enter address line 2"
                                   value=""></div>
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input id="username" type="text" class="form-control" placeholder="enter address line 2"
                                   value=""></div>
                        <div class="form-group">
                            <label for="pasword">Password</label>
                            <input id="pasword" type="number" class="form-control" placeholder="enter address line 2"
                                   value=""></div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary">Save</button>

                        </div>

                    </c>

                    <div class="mt-5 text-center">
                        <button href="/" class="btn btn-primary profile-button" type="submit">Save Profile</button>
                    </div>


                </div>

            </div>
        </div>
    </div>
</div>
</body>

</html>
