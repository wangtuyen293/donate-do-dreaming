<%-- 
    Document   : fillcode
    Created on : Jan 31, 2024, 1:18:11 AM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div class="container mt-5">
    <form action="sendemai" method="post">
        <div class="form-group">
            <label for="code">Enter your code:</label>
            <input type="number" class="form-control" id="code" name="code" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<jsp:include page="footer.jsp" />
