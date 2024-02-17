package controller.home;

import java.io.File;
import java.io.FileOutputStream;
import dao.DAO;
import model.User;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class EditProfileServlet extends HttpServlet {

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

            Part filePart = request.getPart("avatar");
            String realPath = request.getServletContext().getRealPath("/uploads");
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

            File folder = new File(realPath);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            filePart.write(Paths.get(realPath, fileName).toString());
            filePart.write(realPath + "/" + fileName);
            User editedUser = new User(fullName, gender, dateOfBirth, fileName, email, phoneNumber);

            // Thực hiện cập nhật thông tin người dùng
            DAO dao = new DAO();
            boolean success = dao.updateUserProfile(editedUser);

            if (success) {
                // Nếu cập nhật thành công, cập nhật lại thông tin người dùng trong session
                HttpSession session = request.getSession();
                session.setAttribute("user", editedUser);
                response.sendRedirect("profile.jsp");
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

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    public File getFolderUpload() {
        File folderUpload = new File(System.getProperty("user.home") + "/Uploads");
        if (!folderUpload.exists()) {
            folderUpload.mkdirs();
        }
        return folderUpload;
    }
}
