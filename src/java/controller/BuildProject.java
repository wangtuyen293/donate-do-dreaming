/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.CategoryDAO;
import dal.ProjectDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Category;
import model.Project;

/**
 *
 * @author VanHuy
 */
@WebServlet(name = "BuildProject", urlPatterns = {"/build-project"})
public class BuildProject extends HttpServlet {

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
            out.println("<title>Servlet BuildProject</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuildProject at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CategoryDAO c = new CategoryDAO();
        ArrayList<Category> clist = c.getAllCategory();
        request.setAttribute("clist", clist);
        request.getRequestDispatcher("buildproject.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("content");
        String target_raw = request.getParameter("target");
        String category_raw = request.getParameter("category");
        Date startDate = Date.valueOf("startDate");
        Part part = request.getPart("image");
        Date endDate = Date.valueOf("endDate");
        String realPath = request.getServletContext().getRealPath("/assets/img/gallery");
        String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
        String image = "";
        if (fileName != "") {
            part.write(realPath + "/" + fileName);
            image = "assets/img/gallery/" + fileName;
        } else {
            image = "";
        }
        Double target;
        int category;
        ProjectDAO pDAO = new ProjectDAO();
        try {
            target = Double.parseDouble(target_raw);
            category = Integer.parseInt(category_raw);
            Project project = new Project(0, title, target, image, 0.0, "not started", description, startDate, endDate, 0, 0, category);
            pDAO.buildProject(project);
            response.sendRedirect("");// send to listProject or something
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // list of project
    }

}
