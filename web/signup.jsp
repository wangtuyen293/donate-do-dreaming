<%-- 
    Document   : register
    Created on : Jan 23, 2024, 3:18:37 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<div class="container-fluid vh-100">
    <div class="" style="margin-top:100px">
        <div class="rounded d-flex justify-content-center">
            <div class="col-md-4 col-sm-12 shadow-lg p-5 bg-light">
                <div class="text-center">
                    <h3 class="text-primary">Create Account</h3>
                </div>
                <div class="p-4">
                    <form action="signup" method="post">
                        <div class="input-group mb-3">
                            <span class="input-group-text bg-primary"><i
                                    class="bi bi-person-plus-fill text-white"></i></span>
                            <input type="text" class="form-control" name="username" placeholder="Username" required>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text bg-primary"><i
                                    class="bi bi-envelope text-white"></i></span>
                            <input type="email" class="form-control" name="email" placeholder="Email" required>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text bg-primary"><i
                                    class="bi bi-key-fill text-white"></i></span>
                            <input type="password" class="form-control" name="password" id="password" placeholder="Password" required>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text bg-primary"><i
                                    class="bi bi-key-fill text-white"></i></span>
                            <input type="password" class="form-control" name="confirmPassword" id="confirmPassword" placeholder="Confirm Password" required>
                        </div>
                        <div class="d-grid col-12 mx-auto">
                            <button type="submit" class="btn btn-primary" >Sign up</button>
                        </div>
                        <p class="text-center mt-3">Already have an account?
                            <a href="login.jsp" class="btn btn-custom">Log in</a>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp" />
