/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.DonationDAO;
import dal.ProjectDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Donation;
import model.Project;

/**
 *
 * @author VanHuy
 */
@WebServlet(name="LoadProjectDonationList", urlPatterns={"/load-pdonationlist"})
public class LoadProjectDonationList extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String id_raw = request.getParameter("pid");
        int id = Integer.parseInt(id_raw);
        ProjectDAO pDAO = new ProjectDAO();
        Project p = pDAO.selectProjectByID(id);
        DonationDAO dDAO = new DonationDAO();
        ArrayList<Donation> dlist = dDAO.getAllDonationByPid(id); 
        
        int num = dlist.size();
    
        request.setAttribute("dlist", dlist);  
        request.setAttribute("num", num);
        request.setAttribute("p", p.getProjectName());
        request.getRequestDispatcher("projectdonationlist.jsp").forward(request, response); 
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

 
}
