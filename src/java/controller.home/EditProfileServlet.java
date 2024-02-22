package controller;

import dao.DAO;
import java.io.File;
import java.io.FileOutputStream;
import dao.DAO;
import model.User;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
        maxFileSize = 1024 * 1024 * 1000, // 1 GB
        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class EditProfileServlet extends HttpServlet {

    PrintWriter out;
    ServletOutputStream os;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null) {
            // Nếu đã đăng nhập, chuyển hướng đến trang chỉnh sửa
            response.sendRedirect("editProfile.jsp");
        } else {
            // Nếu chưa đăng nhập, chuyển hướng đến trang đăng nhập
            response.sendRedirect("login.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            String us = user.getUserName();
            String fullName = request.getParameter("fullName");
            String email = request.getParameter("email");
            String phoneNumber = request.getParameter("phoneNumber");
            int gender = Integer.parseInt(request.getParameter("gender"));
            Date dateOfBirth = null;

            try {
                java.util.Date utilDateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateOfBirth"));
                dateOfBirth = new java.sql.Date(utilDateOfBirth.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            os = response.getOutputStream();
            String folderName = "resources";
            String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;
            File dir = new File(uploadPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Part filePart = request.getPart("avatar");
            String fileName = filePart.getSubmittedFileName();
            String path = folderName + File.separator + fileName;
            InputStream is = filePart.getInputStream();
            Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);
            User editedUser = new User(fullName, gender, dateOfBirth, email, phoneNumber, path, us);

            // Thực hiện cập nhật thông tin người dùng
            DAO dao = new DAO();
            boolean success = dao.updateUserProfile(editedUser);

            if (success) {
                // Nếu cập nhật thành công, cập nhật lại thông tin người dùng trong session
                session.setAttribute("user", editedUser);
                response.sendRedirect("userinfo.jsp");
            } else {
                // Nếu cập nhật không thành công, chuyển hướng đến trang thông báo lỗi
                request.setAttribute("updateFailed", "Failed to update profile.");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            // Xử lý lỗi nếu cần thiết
        }
    }
}
