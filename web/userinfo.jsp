<%-- 
    Document   : userinfo
    Created on : Jan 30, 2024, 7:27:01 PM
    Author     : quang
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="./layout/header.jsp" />
<section>
    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 400px;">
            <div class="card-header bg-primary text-white">
                <h1 class="h3 mb-0" style="text-align: center;">Your Profile</h1>
            </div>
            <div class="card-body">
                <c:if test="${not empty user.avatar}">
                    <%-- Lấy context path từ request --%>
                    <c:set var="contextPath" value="${pageContext.request.contextPath}" />

                    <%-- Tạo đường dẫn đầy đủ bằng cách thêm context path vào avatarPath --%>
                    <c:set var="fullAvatarPath" value="${contextPath}/${user.avatar}" />

                    <%-- Hiển thị hình ảnh --%>
                    <img src="${fullAvatarPath}" class="img-fluid" alt="Avatar">
                </c:if>

                <c:if test="${not empty sessionScope.user}">
                    <c:set var="user" value="${sessionScope.user}" />

                    <div class="form-group">
                        <label for="fullName">Full Name:</label>
                        <input type="text" class="form-control" id="fullName" name="fullName" value="<c:if test='${not empty user.fullName}'>${user.fullName}</c:if>" readonly>
                        </div>

                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" class="form-control" id="email" name="email" value="<c:if test='${not empty user.email}'>${user.email}</c:if>" readonly>
                        </div>
                        <div class="form-group">
                            <label for="gender">Gender:</label>
                            <input type="text" class="form-control" id="gender" name="gender" value="<c:if test='${not empty user.gender}'>${user.gender}</c:if>" readonly>
                        </div>
                        <div class="form-group">
                            <label for="dateOfBirth">Date of Birth:</label>
                            <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" value="<fmt:formatDate value='${user.dateOfBirth}' pattern='yyyy-MM-dd' />" readonly>
                    </div>
                    <div class="form-group">
                        <label for="phoneNumber">Phone Number:</label>
                        <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber" value="<c:if test='${not empty user.phoneNumber}'>${user.phoneNumber}</c:if>" readonly>
                        </div>

                        <!-- Các trường thông tin khác cũng thêm kiểm tra null tương tự -->

                        <button type="button" class="btn btn-light ">
                            <a href="editProfile.jsp"> Edit Profile</a>
                        </button>
                        <button type="button" class="btn btn-light ">
                            <a href="getEmailCode.jsp"> Change password</a>
                        </button>
                </c:if>

            </div>
        </div>
    </div>
</section>

<jsp:include page="./layout/footer.jsp" />
