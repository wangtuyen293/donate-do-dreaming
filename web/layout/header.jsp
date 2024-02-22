<%-- 
    Document   : header
    Created on : Jan 13, 2024, 3:48:33 PM
    Author     : quang
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="preloader-active">
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="preloader-inner position-relative">
            <div class="preloader-circle"></div>
            <div class="preloader-img pere-text">
                <img src="assets/img/logo/dendi2.png" alt="logo">
            </div>
        </div>
    </div>
</div>
<header>
    <div class="header-area">
        <div class="main-header header-sticky">
            <div class="container-fluid">
                <div class="menu-wrapper">
                    <div class="logo">
                        <a href="home.jsp"><img src="assets/img/logo/dendi2.png" alt="logo"></a>
                    </div>
                    <div class="main-menu d-none d-lg-block">
                        <nav>

                            <ul id="navigation">
                                <li><a href="home.jsp">Home</a></li>
                                <li><a href="buildproject.jsp">Start a project</a></li>
                                <li><a href="allproject.jsp">Projects</a></li>
                                <li><a href="contact.jsp">Contact</a></li>
                            </ul>
                        </nav>
                    </div>

                    <div class="header-right">
                        <ul>
                            <li>
                                <form class="d-flex" role="search">
                                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                        <button class="btn btn-info" type="submit">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                                                <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                                            </svg>
                                        </button>
                                </form>
                            </li>
                            <%
                                User loggedInUser = (User) session.getAttribute("user");
                                if (loggedInUser != null) {
                            %>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <%= loggedInUser.getUserName()%>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a class="dropdown-item" href="userinfo.jsp">Edit Profile</a>
                                    <a class="dropdown-item" href="#">View Donate History</a>
                                    <a class="dropdown-item" href="logout">Logout</a>

                                    <!-- Add more options as needed -->
                                </div>
                            </li>
                            <% } else { %>
                            <li class="nav-item">
                                <a class="nav-link" href="login.jsp" style="margin-left: 10px;">
                                    <button type="button" class="btn btn-outline-info">Log in</button>
                                </a>
                            </li>
                            <% }%>


                        </ul>
                    </div>
                </div>

                <div class="col-12">
                    <div class="mobile_menu d-block d-lg-none"></div>
                </div>
            </div>
        </div>
    </div>
</header>    