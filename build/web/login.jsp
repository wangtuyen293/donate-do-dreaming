<%-- 
    Document   : login
    Created on : Jan 18, 2024, 11:01:49 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<section style="border: 2px solid #333; background-color: #f4f4f4; border-radius: 10px; text-align: center; padding: 0;">
    <form action="login" method="post" class="custom-form" style="display: inline-block; text-align: left; margin: 10px; padding: 20px;">
        <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password">
        </div>
        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="remember">
            <label class="form-check-label" for="remember">Remember me</label>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
        <a href="signup.jsp" style="color: red; margin-left: 5px; border: 1px solid red; padding: 5px; text-decoration: none;">Sign up</a>
        <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/fundunity/login-google&response_type=code
           &client_id=884665707063-a1e68npi45f6p3nkmlasm1m9s4vm4bmq.apps.googleusercontent.com&approval_prompt=force" style="color: red; margin-left: 5px; border: 1px solid red; padding: 5px; text-decoration: none;">Login With Google</a> 
        <a href="forgotpass.jsp" style="color: red; margin-left: 5px; border: 1px solid red; padding: 5px; text-decoration: none;">Forgot your password?</a>

    </form>
</section>



<jsp:include page="footer.jsp" />
