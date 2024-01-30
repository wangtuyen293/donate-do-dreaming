<%-- 
    Document   : change-password
    Created on : Jan 31, 2024, 1:38:03 AM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" />
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    Change Password Result
                </div>
                <div class="card-body">
                    <%-- Hiển thị thông báo thành công --%>
                    <% if (request.getParameter("success") != null) { %>
                    <div class="alert alert-success" role="alert">
                        Password changed successfully!
                        <a href="home.jsp">Return to homepage!</a>
                    </div>
                    <% } %>

                    <%-- Hiển thị thông báo lỗi --%>
                    <% if (request.getParameter("error") != null) { %>
                    <div class="alert alert-danger" role="alert">
                        <%-- Lựa chọn thông báo dựa trên mã lỗi --%>
                        <% if (request.getParameter("error").equals("1")) { %>
                        New password and confirm password do not match.
                        <% } else if (request.getParameter("error").equals("2")) { %>
                        Current password is incorrect.
                        <% } %>
                    </div>
                    <% }%>

                    <%-- Nút để quay lại trang thay đổi mật khẩu --%>
                    <a href="changePassword.jsp" class="btn btn-primary">Back to Change Password</a>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp" />
