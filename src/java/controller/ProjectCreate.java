/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import static com.sun.javafx.scene.CameraHelper.project;
import dal.CategoryDAO;
import dal.ProjectDAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
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
import javax.servlet.http.Part;
import model.Category;
import model.Project;
import model.User;

/**
 *
 * @author VanHuy
 */
@WebServlet(name = "ProjectCreate", urlPatterns = {"/create-project"})
public class ProjectCreate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProjectCreate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProjectCreate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            String action = request.getParameter("action");
            if (action != null && action.equals("create-project")) {
                request.getRequestDispatcher("projectcreate.jsp").forward(request, response);
                response.sendRedirect("projectcreate.jsp");
            }

            CategoryDAO c = new CategoryDAO();
            ArrayList<Category> clist = c.getAllCategory();
            request.setAttribute("clist", clist);
            request.getRequestDispatcher("projectcreate.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        User user = (User) request.getSession().getAttribute("user");

        String title = request.getParameter("title");
        String description = request.getParameter("description");

        String target_raw = request.getParameter("target");
        String category_raw = request.getParameter("categoryId");
        String startDate_raw = request.getParameter("startDate");
        String endDate_raw = request.getParameter("endDate");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date startDate = null;
        Date endDate = null;
        double target = 0;
        int category = 1;

        try {
            startDate = (Date) dateFormat.parse(startDate_raw);
            endDate = (Date) dateFormat.parse(endDate_raw);
            target = Double.parseDouble(target_raw);
            category = Integer.parseInt(category_raw);
        } catch (Exception e) {
            e.printStackTrace();
        }        
        Project project = new Project(title, target, null, 0, "New", description, startDate, endDate, 0, 1, category);
        ProjectDAO pDAO = new ProjectDAO();
        pDAO.createProject(project);

        if (project.getProjectStatus().equals("New")) {
            response.sendRedirect("projectcreate_success.jsp");
        } else {
            response.sendRedirect("projectcreate_failed.jsp");
        }

    }

}
