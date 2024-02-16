<%-- 
    Document   : buildproject.jsp
    Created on : Jan 25, 2024, 2:37:15 PM
    Author     : VanHuy
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
!<!doctype html>
<main>
    <div class="container">
        <h1>Create a Project</h1>
        <form action="build-project" method="post">
            <div class="mb-3">
                <label for="post-title" class="form-label">Title</label>
                <input type="text" class="form-control" id="post-title" name="title" required>
            </div>
            <div class="mb-3">
                <label for="post-content" class="form-label">Description </label>
                <textarea class="form-control" id="post-content" name="content" rows="10" required></textarea>
            </div>
            <div class="mb-3">
                <label>Image</label><br /> <input type="file" name="image">
            </div>
            <div class="mb-3">
                <label for="post-goal" class="form-label">Target</label>
                <input type="number" class="form-control" id="post-goal" name="target" placeholder="0.00" min="0" step="0.01" required>
            </div>
            <div class="mb-3">
                <label for="post-category" class="form-label">Category</label>
                <select class="form-select" id="post-category" name="category" required>
                    <option value="null">Select a Category</option>
                    <c:forEach items="${clist}" var="c">
                        <option value="${c.categoryId}">${c.categoryName}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="mb-3">
                <label for="post-start-date" class="form-label">Start Date</label>
                <input type="date" class="form-control" id="post-start-date" name="startDate" required>
            </div>
            <div class="mb-3">
                <label for="post-endx-date" class="form-label">End Date</label>
                <input type="date" class="form-control" id="post-end-date" name="endDate" required>
            </div>
            <button type="submit" class="btn btn-primary" style="border-radius: 25px; margin-top: 15px">Start</button>
        </form>

    </div>

    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MhqjwqK/bNCSA/WqAX+uHacUonVujUUN6q6qC8J7jAK/uX4nuxL46k1KpaS"
        crossorigin="anonymous"
    ></script>
</main>
<jsp:include page="footer.jsp" />