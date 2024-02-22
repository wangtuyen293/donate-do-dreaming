package controller;

import dal.CategoryDAO;
import dal.ProjectDAO;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Project;
import model.User;

@WebServlet(name = "ProjectCreate", urlPatterns = {"/create-project"})
public class ProjectCreate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) request.getSession().getAttribute("user");
        if (session.getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
        } else {
            String action = request.getParameter("action");
            if (action != null && action.equals("create-project")) {
                session.setAttribute("user_id", user.getUserId());
                request.getRequestDispatcher("projectcreate.jsp").forward(request, response);
            } else {
                CategoryDAO c = new CategoryDAO();
                ArrayList<Category> clist = c.getAllCategory();
                request.setAttribute("clist", clist);
                request.getRequestDispatcher("projectcreate.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("user_id");

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String target_raw = request.getParameter("target");
        String categoryId_raw = request.getParameter("categoryId");
        String startDate_raw = request.getParameter("startDate");
        String endDate_raw = request.getParameter("endDate");

        // Validate parameters
        if (title == null || description == null || target_raw == null || categoryId_raw == null || startDate_raw == null || endDate_raw == null) {
            response.sendRedirect("projectcreate_failed.jsp");
            return;
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date startDate;
        Date endDate;
        Double target;
        int categoryId;

        try {
            startDate = new Date(dateFormat.parse(startDate_raw).getTime());
            endDate = new Date(dateFormat.parse(endDate_raw).getTime());

            target = Double.parseDouble(target_raw);
            categoryId = Integer.parseInt(categoryId_raw);

            Project project = new Project(title, target, null, 0, "New", description, startDate, endDate, 0, userId, categoryId);
            ProjectDAO pDAO = new ProjectDAO();
            pDAO.createProject(project);

            if (project.getProjectName() != null) {
                response.sendRedirect("projectcreate_success.jsp");
            }
        } catch (ParseException | NumberFormatException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi tạo project: " + e.getMessage());

        }
    }
}
