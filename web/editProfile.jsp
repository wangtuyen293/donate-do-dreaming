<%-- 
    Document   : editProfile
    Created on : Jan 30, 2024, 9:48:27 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:include page="./layout/header.jsp" />
<<section>
    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 400px;">
            <div class="card-header bg-primary text-white">
                <h1 class="h3 mb-0" style="text-align: center">Your Profile</h1>
            </div>
            <div class="card-body">
                <c:if test="${not empty sessionScope.user}">
                    <c:set var="user" value="${sessionScope.user}" />

                    <form action="editprofile" method="post" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="avatar">Avatar:</label>
                            <input type="file" class="form-control-file" id="avatar" name="avatar" size="100">
                        </div>
                        <div class="form-group">
                            <label for="fullName">Full Name:</label>
                            <input type="text" class="form-control" id="fullName" name="fullName" value="${user.fullName}" required>
                        </div>

                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" class="form-control" id="email" name="email" value="${user.email}" required>
                        </div>

                        <div class="form-group">
                            <label for="phoneNumber">Phone Number:</label>
                            <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber}" required>
                        </div>

                        <div class="form-group">
                            <label for="gender">Gender:</label>
                            <select class="form-control" id="gender" name="gender" required>
                                <option value="1" ${user.gender == 1 ? 'selected' : ''}>Male</option>
                                <option value="2" ${user.gender == 2 ? 'selected' : ''}>Female</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="dateOfBirth">Date of Birth:</label>
                            <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" value="<fmt:formatDate value='${user.dateOfBirth}' pattern='yyyy-MM-dd' />" required>
                        </div>

                        <button type="submit" class="btn btn-primary btn-block">Update Profile</button>
                    </form>
                </c:if>
            </div>
        </div>
    </div>
</section>
<jsp:include page="./layout/footer.jsp" />