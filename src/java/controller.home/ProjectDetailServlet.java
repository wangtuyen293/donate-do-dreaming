package Controller;

import Model.Project;
import Model.ProjectManager;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/project-detail")
public class ProjectDetailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy ID từ tham số truy vấn
        int projectId = Integer.parseInt(request.getParameter("id"));

        // Lấy thông tin chi tiết của dự án từ CharityProjectManager
        Project project = ProjectManager.getProjectById(projectId);
        
        request.setAttribute("projectId", projectId);
        request.getRequestDispatcher("/project-detail.jsp").forward(request, response);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Project Detail</title></head><body>");
        if (project != null) {
            out.println("<h2>Project Detail</h2>");
            out.println("<p>ID: " + project.getProjectId() + "</p>");
            out.println("<p>Name: " + project.getProjectName() + "</p>");
            out.println("<p>Target: " + project.getProjectTarget() + "</p>");
            out.println("<p>Image: " + project.getProjectImage() + "</p>");
            out.println("<p>Donate: " + project.getDonatedAmountOfMoney() + "</p>");
            out.println("<p>Project Status: " + project.getProjectStatus() + "</p>");
            out.println("<p>Start Date: " + project.getStartDate() + "</p>");
            out.println("<p>End Date: " + project.getEndDate() + "</p>");
            out.println("<p>User Id: " + project.getUserId() + "</p>");
            out.println("<p>Charity Organization Id: " + project.getCharityOrganizationId() + "</p>");
            out.println("<p>Category Id: " + project.getCategoryId() + "</p>");
        } else {
            out.println("<p>Project not found</p>");
        }
        out.println("</body></html>");
    }
}
