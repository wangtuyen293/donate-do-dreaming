<%-- 
    Document   : register
    Created on : Jan 23, 2024, 3:18:37 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<section class="container mt-5">
    <form action="signup" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label for="fullName">Full Name:</label>
            <input type="text" class="form-control" id="fullName" name="fullName" required>
        </div>

        <div class="form-group">
            <label for="userName">Username:</label>
            <input type="text" class="form-control" id="userName" name="userName" required>
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label>Gender:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="male" name="gender" value="1" checked>
                <label class="form-check-label" for="male">Male</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" id="female" name="gender" value="2">
                <label class="form-check-label" for="female">Female</label>
            </div>
        </div>

        <div class="form-group">
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" required>
        </div>
        <div class="form-group">
            <label for="avatar">Avatar:</label>
            <input type="file" class="form-control" id="avatar" name="avatar" required>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>

        <div class="form-group">
            <label for="phoneNumber">Phone Number:</label>
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
        </div>
        <button type="submit" class="btn btn-primary">Sign Up</button>
    </form>
</section>
<jsp:include page="footer.jsp" />
