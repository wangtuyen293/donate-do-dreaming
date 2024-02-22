<%-- 
    Document   : projectDetails
    Created on : Feb 4, 2024, 3:47:12 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="./layout/header.jsp" />
<div class="container mt-4">
    <div class="row">
        <div class="col-lg-8">
            <div class="card mb-4">
                <img src="https://via.placeholder.com/800x400" class="card-img-top" alt="Project Image">
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
                                    <a class="nav-link" data-bs-toggle="tab" href="#comment">Comment</a>
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
                    <div class="tab-pane fade show active" id="project-details">
                        <h1 class="card-title">Awesome Project Title</h1>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item"><strong>Goal:</strong> $10,000</li>
                            <li class="list-group-item"><strong>Funded:</strong> $7,500</li>
                            <li class="list-group-item"><strong>Days Left:</strong> 15</li>
                            <li class="list-group-item"><strong>Backers:</strong> 100</li>
                        </ul>
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
                    <div class="tab-pane fade" id="comment">
                        <!-- Comment content goes here -->
                    </div>
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

<jsp:include page="./layout/footer.jsp" />