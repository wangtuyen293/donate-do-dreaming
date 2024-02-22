<%-- 
    Document   : getEmailCode
    Created on : Jan 31, 2024, 1:01:47 AM
    Author     : quang
--%>

<jsp:include page="./layout/header.jsp" />
<div class="container mt-5">
    <form action="sendemai" method="get">
        <div class="form-group">
            <label for="code">Enter your email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<jsp:include page="./layout/footer.jsp" />