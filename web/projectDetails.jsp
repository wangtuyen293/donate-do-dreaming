<%-- 
    Document   : projectDetails
    Created on : Feb 4, 2024, 3:47:12 PM
    Author     : quang
--%>

<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.util.*" %>
<jsp:include page="header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mt-4">
    <div class="row">
        <div class="col-lg-8">
            <div class="card mb-4">
                  <img src="image?id=1" alt="Database Image">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link active" data-bs-toggle="tab" href="#project-details">Project Details</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#feedback">Feedback</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="Comment.jsp">Comment</a>
                                </li>   
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#donate-history">Donate History</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#faq">FAQ</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- End Navbar -->

                <div class="card-body tab-content">
                    <!-- Project Details Tab -->
            <c:forEach var="project" items="${projectList}">
                    <div class="tab-pane fade show active" id="project-details">
                        <h2>Project ID: ${project.projectId}</h2>
                                <p>Project Name: ${project.projectName}</p>
                                <p>Project Target: ${project.projectTarget}</p>
                                <p>Donated Amount of Money: ${project.donatedAmountOfMoney}</p>
                                <p>Project Status: ${project.projectStatus}</p>
                                <p>Project Description: ${project.projectDescription}</p>
                                <p>Start Date: ${project.startDate}</p>
                                <p>End Date: ${project.endDate}</p>
       
                    </div>
                    <hr>
            </c:forEach>
                        <div class="card-body">
                            <button class="btn btn-primary">Back to Projects</button>
                        </div>
                    </div>

                    <!-- End Project Details Tab -->

                    <!-- Feedback Tab -->
                    <div class="tab-pane fade" id="feedback">
                        <!-- Feedback content goes here -->
                    </div>
                    <!-- End Feedback Tab -->

                    <!-- Comment Tab -->
                               
                    <!-- End Comment Tab -->

                    <!-- Donate History Tab -->
                    <div class="tab-pane fade" id="donate-history">
                        <!-- Donate History content goes here -->
                    </div>
                    <!-- End Donate History Tab -->

                    <!-- FAQ Tab -->
                    <div class="tab-pane fade" id="faq">
                        <!-- FAQ content goes here -->
                    </div>
                    <!-- End FAQ Tab -->
                </div>
            </div>
        </div>
                                <div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v19.0&appId=416821421006509" nonce="ACjhhA67"></script>
<div class="fb-comments" data-href="https://developers.facebook.com/docs/plugins/comments#configurator" data-width="1100" data-numposts="5"></div>

        <div class="col-lg-4">
            <div class="card mb-4">
                <div class="card-body">
                    <h2 class="card-title">Milestones</h2>
                    <div class="mb-3">
                        <h3>$50 - Thank You Card</h3>
                        <p>Receive a personalized thank you card for your support.</p>
                    </div>
                    <div>
                        <h3>$100 - Exclusive Project Sticker</h3>
                        <p>Get an exclusive project sticker to show your support.</p>
                    </div>
                    <!-- Add more milestones as needed -->
                </div>
            </div>
        </div>
    </div>
</div

<jsp:include page="footer.jsp" />