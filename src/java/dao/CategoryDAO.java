package dao;

import db.DonationDBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author OS
 */
public class CategoryDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private static final Logger logger = Logger.getLogger(CategoryDAO.class.getName());
    
    public List<Category> getAllCategories() {
        List<Category> list = new ArrayList<>();
        String sql = "SELECT * FROM Category";
        try {
            conn = new DonationDBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(category);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            closeResources(conn, ps, rs);
        }
        return list;
    }
    
    // Close database resources (connection, statement, and result set)
    private void closeResources(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        System.out.println(categoryDAO.getAllCategories());
    }
}
