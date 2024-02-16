<%-- 
    Document   : projectdonationlist
    Created on : Jan 30, 2024, 1:25:03 PM
    Author     : VanHuy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />

<div class="container" style="margin-top: 100px">
    <h2 class="mb-4">${p.name} : ${num}</h2>

    <table class="table table-bordered table-hover" style="border:#fff ">
        <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Phone Number</th>
                <th scope="col">Email</th>
                <th scope="col">Donation</th>
                <th scope="col">Date</th>
            </tr>
        </thead>
        <c:forEach items="dlist" var="d">
            <tbody>
                <tr>
                    <td>${d.user.name}</td>
                    <td>${d.user.numberPhone}</td>
                    <td>${d.user.email}</td>
                    <td>$${d.amountOfMoney}</td>
                    <td>${d.donationTime}</td>
                </tr>
            </tbody>
        </c:forEach>
        </table>
    </div>


<jsp:include page="footer.jsp" />