/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.DAO;
import Model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author quang
 */
@MultipartConfig(maxFileSize = 16177215)
public class SignUpServlet extends HttpServlet {

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
            out.println("<title>Servlet SignUpServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpServlet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        String fullName = request.getParameter("fullName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        int gender = Integer.parseInt(request.getParameter("gender"));
        Date dateOfBirth = Date.valueOf(request.getParameter("dateOfBirth"));
        Part ava = request.getPart("avatar");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String realPath = request.getServletContext().getRealPath("/images");
        // Tạo tên file dựa trên timestamp để tránh trùng lặp
        String timestamp = String.valueOf(System.currentTimeMillis());
        String filename = timestamp + "_" + Paths.get(ava.getSubmittedFileName()).getFileName().toString();
        // Lưu file vào thư mục ảnh
        try ( InputStream is = ava.getInputStream();  FileOutputStream fos = new FileOutputStream(realPath + File.separator + filename)) {
            Files.copy(is, Paths.get(realPath + File.separator + filename), StandardCopyOption.REPLACE_EXISTING);
        }

        // Đọc nội dung ảnh và chuyển đổi thành mảng byte
        File imageFile = new File(realPath + File.separator + filename);
        byte[] avatarBytes = Files.readAllBytes(imageFile.toPath());

        User user = new User(fullName, userName, password, gender, dateOfBirth, avatarBytes, email, phoneNumber);
        user.setAvatar(avatarBytes);  // Set mảng byte cho avatar

        DAO dao = new DAO();
        dao.addUser(user);

        response.sendRedirect("registration-success.jsp");
    }

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
@Override
public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
