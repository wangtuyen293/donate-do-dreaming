<%-- 
    Document   : header
    Created on : Jan 13, 2024, 3:48:33 PM
    Author     : quang
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Donate Do Dreamers</title>
        <meta name="description" content>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="manifest" href="site.webmanifest">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/flaticon.css">
        <link rel="stylesheet" href="assets/css/slicknav.css">
        <link rel="stylesheet" href="assets/css/animate.min.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="./style.css"> 
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/material-design-iconic-font/2.2.0/css/material-design-iconic-font.min.css">
        <style>
            /* Đặt độ rộng cho form và căn giữa trang */
            .custom-form {
                max-width: 50%;
                margin: auto;
                margin-top: 50px; /* Điều chỉnh khoảng cách từ trên xuống theo ý muốn */
            }
        </style>
        <script nonce="d2fa0ba4-a7ad-4e33-aa0b-7c90e6c942d6">
            (function (w, d) {
                !function (dp, dq, dr, ds) {
                    dp[dr] = dp[dr] || {};
                    dp[dr].executed = [];
                    dp.zaraz = {
                        deferred: [],
                        listeners: []
                    };
                    dp.zaraz.q = [];
                    dp.zaraz._f = function (dt) {
                        return async function () {
                            var du = Array.prototype.slice.call(arguments);
                            dp.zaraz.q.push({
                                m: dt,
                                a: du
                            })
                        }
                    };
                    for (const dv of ["track", "set", "debug"])
                        dp.zaraz[dv] = dp.zaraz._f(dv);
                    dp.zaraz.init = () => {
                        var dw = dq.getElementsByTagName(ds)[0],
                                dx = dq.createElement(ds),
                                dy = dq.getElementsByTagName("title")[0];
                        dy && (dp[dr].t = dq.getElementsByTagName("title")[0].text);
                        dp[dr].x = Math.random();
                        dp[dr].w = dp.screen.width;
                        dp[dr].h = dp.screen.height;
                        dp[dr].j = dp.innerHeight;
                        dp[dr].e = dp.innerWidth;
                        dp[dr].l = dp.location.href;
                        dp[dr].r = dq.referrer;
                        dp[dr].k = dp.screen.colorDepth;
                        dp[dr].n = dq.characterSet;
                        dp[dr].o = (new Date).getTimezoneOffset();
                        if (dp.dataLayer)
                            for (const dC of Object.entries(Object.entries(dataLayer).reduce(((dD, dE) => ({
                            ...dD[1],
                                    ...dE[1]
                            })), {})))
                                zaraz.set(dC[0], dC[1], {
                                    scope: "page"
                                });
                        dp[dr].q = [];
                        for (; dp.zaraz.q.length; ) {
                            const dF = dp.zaraz.q.shift();
                            dp[dr].q.push(dF)
                        }
                        dx.defer = !0;
                        for (const dG of [localStorage, sessionStorage])
                            Object.keys(dG || {}).filter((dI => dI.startsWith("_zaraz_"))).forEach((dH => {
                                try {
                                dp[dr]["z_" + dH.slice(7)] = JSON.parse(dG.getItem(dH))
                                } catch {
                                dp[dr]["z_" + dH.slice(7)] = dG.getItem(dH)
                                }
                            }));
                        dx.referrerPolicy = "origin";
                        dx.src = "/cdn-cgi/zaraz/s.js?z=" + btoa(encodeURIComponent(JSON.stringify(dp[dr])));
                        dw.parentNode.insertBefore(dx, dw)
                    };
                    ["complete", "interactive"].includes(dq.readyState) ? zaraz.init() : dp.addEventListener("DOMContentLoaded", zaraz.init)
                }(w, d, "zarazData", "script");
            })(window, document);
        </script>
        <style>
        /* Add your custom styles here */

        /* Adjust the alignment of the logo in the header */
        .header-area .logo {
            text-align: center;
        }

        /* Style the search form in the header */
        .header-right form {
            display: flex;
            align-items: center;
        }

        /* Style the login dropdown menu */
        .header-right .dropdown-menu {
            left: auto;
            right: 0;
        }

        /* Make the dropdown content appear from right to left */
        .header-right .dropdown-menu {
            transform: translateX(-90%);
        }

        /* Add margin to the login button */
        .header-right .nav-link {
            margin-left: 10px;
        }
    </style>
    </head>
    <body>
        <div id="preloader-active">
            <div class="preloader d-flex align-items-center justify-content-center">
                <div class="preloader-inner position-relative">
                    <div class="preloader-circle"></div>
                    <div class="preloader-img pere-text">
                        <img src="assets/img/logo/dendi2.png" alt>
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
                                <a href="home.jsp"><img src="assets/img/logo/dendi2.png" alt></a>
                            </div>
                            <div class="main-menu d-none d-lg-block">
                                <nav>

                                    <ul id="navigation">
                                        <li><a href="home.jsp">Trang chủ</a></li>
                                        <li><a href="buildproject.jsp">Start a project</a></li>
                                        <li><a href="allproject.jsp">Toàn bộ các dự án</a></li>
                                        <li><a href="contact.jsp">Contact</a></li>
                                    </ul>
                                </nav>
                            </div>

                            <div class="header-right ">
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

