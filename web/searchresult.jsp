<%@page import="Model.ProjectManager"%>
<%@page import="java.util.List"%>
<%@page import="Model.Project"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:include page="header.jsp" />
<html>
<head>
    <title>Search Results</title>
</head>
<body>
    <h2>Search Results</h2>

    <% 
        String keyword = request.getParameter("keyword");
        List<Project> searchResults = ProjectManager.searchProjects(keyword);
    %>

    <% if (searchResults != null && !searchResults.isEmpty()) { %>
        <ul>
            <% for (Project project : searchResults) { %>
                <li>
                    <p>ID: <%= project.getProjectId() %></p>
                    <p>Name: <%= project.getProjectName() %></p>
                </li>
            <% } %>
        </ul>
    <% } else { %>
        <p>No results found for the keyword <%= keyword %></p>
    <% } %>
</body>
</html>
<jsp:include page="footer.jsp" />