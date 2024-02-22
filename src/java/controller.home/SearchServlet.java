package Controller;

import Model.Project;
import Model.ProjectManager;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy từ khóa từ tham số truy vấn
        String keyword = request.getParameter("keyword");

        // Tìm kiếm dự án theo từ khóa từ CharityProjectManager
        List<Project> searchResults = ProjectManager.searchProjects(keyword);

        // Chuyển hướng đến trang JSP và truyền kết quả tìm kiếm
        request.setAttribute("searchResults", searchResults);
        request.getRequestDispatcher("/searchresult.jsp").forward(request, response);
    }
}
