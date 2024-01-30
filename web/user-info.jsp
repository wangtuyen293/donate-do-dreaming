<%-- 
    Document   : user-info
    Created on : Jan 26, 2024, 2:29:55 PM
    Author     : quang
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp" />
<section>
    
    <h1>User Information</h1>
    <p>Name: ${user.name}</p>
    <p>Email: ${user.email}</p>
    <img src="${user.picture}" alt="Describe image here" width="200">    
</section>
<jsp:include page="footer.jsp" />
