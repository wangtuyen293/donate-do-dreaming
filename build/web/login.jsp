<%-- 
    Document   : login
    Created on : Jan 18, 2024, 11:01:49 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<div class="container" style="margin-top: 100px">
    <div class="row">
        <div class="col-md-11 mt-60 mx-md-auto">
            <div class="login-box bg-white pl-lg-5 pl-0">
                <div class="row no-gutters align-items-center">
                    <div class="col-md-6">
                        <div class="form-wrap bg-white">
                            <h4 class="btm-sep pb-3 mb-5">Login</h4>
                            <form class="form" action="login" method="post" >
                                <div class="row">
                                    <div class="col-12">
                                        <div class="form-group position-relative">
                                            <span class="zmdi zmdi-account"></span>
                                            <input type="text" id="username" name="username" class="form-control" placeholder="User name">
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-group position-relative">
                                            <span class="zmdi zmdi-lock"></span>
                                            <input type="password" id="password" name="password" class="form-control" placeholder="Password">
                                        </div>
                                    </div>
                                    <div class="col-12 text-lg-right">
                                        <input type="checkbox" name="rememberMe" id="rememberMe">
                                        <label for="rememberMe">Remember me</label>
                                    </div>

                                    <div class="col-12 text-lg-right">
                                        <a href="resetpassword.jsp" class="c-black">Forgot password ?</a>
                                    </div>
                                    <div class="col-12 mt-30">
                                        <button type="submit" id="submit" class="btn btn-lg btn-custom btn-dark btn-block">Sign In
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="content text-center">
                            <div class="border-bottom pb-5 mb-5">
                                <h3 class="c-black">First time here?</h3>
                                <a href="signup.jsp" class="btn btn-custom">Sign up</a>
                            </div>
                            <h5 class="c-black mb-4 mt-n1">Or Sign In With</h5>
                            <div class="socials">
                                <a href="#" class="zmdi zmdi-facebook"></a>
                                <a href="https://accounts.google.com/o/oauth2/auth?scope=email profile&redirect_uri=http://localhost:8080/fundunity/logingoogle&response_type=code
                                   &client_id=884665707063-a1e68npi45f6p3nkmlasm1m9s4vm4bmq.apps.googleusercontent.com&approval_prompt=force" class="zmdi zmdi-google"></a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="footer.jsp" />
