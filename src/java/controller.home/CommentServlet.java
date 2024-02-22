package Controller;



import DAO.CommentDAO;
import Model.Comment;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private CommentDAO commentDAO;

    public void init() {
        commentDAO = new CommentDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("list".equals(action)) {
            listComments(request, response);
        } else if ("delete".equals(action)) {
            deleteComment(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            try {
                addComment(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(CommentServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("update".equals(action)) {
            try {
                updateComment(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(CommentServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void listComments(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> comments = commentDAO.getAllComments();
        request.setAttribute("comments", comments);
        request.getRequestDispatcher("listComments.jsp").forward(request, response);
    }

    private void addComment(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        String comment = request.getParameter("comment");
        commentDAO.insertComment(comment);
        response.sendRedirect("CommentServlet?action=list");
    }

    private void updateComment(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        String oldComment = request.getParameter("oldComment");
        String newComment = request.getParameter("newComment");
        commentDAO.updateComment(oldComment, newComment);
        response.sendRedirect("CommentServlet?action=list");
    }

    private void deleteComment(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String comment = request.getParameter("comment");
        try {
            commentDAO.deleteComment(comment);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("CommentServlet?action=list");
    }
}
