/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.ProjectDAO;
import dal.ProjectProcessDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Project;
import model.ProjectProcess;

/**
 *
 * @author VanHuy
 */
@WebServlet(name = "AddProjectProcesss", urlPatterns = {"/addpp"})
public class AddProjectProcess extends HttpServlet {

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
            out.println("<title>Servlet AddProjectProcess</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProjectProcess at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_raw = request.getParameter("pid");
        int id = Integer.parseInt(id_raw);
        ProjectDAO pDAO = new ProjectDAO();
        Project p = pDAO.selectProjectByID(id);
        request.setAttribute("p", p);
        request.getRequestDispatcher("updateprojectprocess.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        java.util.Date currentDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());

        String planOfPhase = request.getParameter("planOfPhase");

        String moneyCost_raw = request.getParameter("moneyCost");
        Double moneyCost = Double.parseDouble(moneyCost_raw);

        String description = request.getParameter("description");

        Part p = request.getPart("files");
        String fileName = p.getSubmittedFileName();

        ProjectProcess pp = new ProjectProcess(sqlDate, planOfPhase, moneyCost, fileName, description);
        ProjectProcessDAO ppDAO = new ProjectProcessDAO();

        int i = ppDAO.updateProjectProcess(pp);
        if (i == 1) {
            String path = getServletContext().getRealPath("") + "projectprocess";

            p.write(path + File.separator + fileName);

            session.setAttribute("msg", "Success");
            response.sendRedirect("addprojectprocess.jsp");
        } else {
            response.sendRedirect("home.jsp");
        }
    }

}
