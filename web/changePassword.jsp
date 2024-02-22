<%-- 
    Document   : changePassword
    Created on : Jan 31, 2024, 12:56:49 AM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="./layout/header.jsp" />
<%@ page import="javax.servlet.http.HttpSession" %>

<%
    String username = (String) session.getAttribute("username");
%>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    Change Password
                </div>
                <div class="card-body">
                    <form action="changepassword" method="post">
                        <div class="form-group">
                            <input type="hidden" class="form-control" name="username" value="<%= username %>" >
                        </div>
                        <div class="form-group">
                            <label for="newPassword">New Password</label>
                            <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter new password">
                        </div>
                        <div class="form-group">
                            <label for="confirmPassword">Confirm New Password</label>
                            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm new password">
                        </div>
                        <button type="submit" class="btn btn-primary">Change Password</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="./layout/footer.jsp" />
