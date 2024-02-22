/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dal.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;

/**
 *
 * @author VanHuy
 */
public class ProjectDAO {

    public void createProject(Project project) {
        Connection con = ConnectDB.getConnection();
        String sql = "INSERT INTO [dbo].[Project]\n"
                + "           ([projectName]\n"
                + "           ,[projectTarget]\n"
                + "           ,[projectImage]\n"
                + "           ,[donatedAmountOfMoney]\n"
                + "           ,[projectStatus]\n"
                + "           ,[projectDescription]\n"
                + "           ,[startDate]\n"
                + "           ,[endDate]\n"
                + "           ,[isApproved]\n"
                + "           ,[userId]\n"
                + "           ,[charityOrganizationId]\n"
                + "           ,[categoryId])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, project.getProjectName());
            st.setDouble(2, project.getProjectTarget());
            st.setString(3, null);
            st.setDouble(4, 0);
            st.setString(5, "New");
            st.setString(6, project.getProjectDescription());
            st.setDate(7, project.getStartDate());
            st.setDate(8, project.getEndDate());
            st.setInt(9, 0);
            st.setInt(10, project.getUserId());
            st.setInt(11, 0);
            st.setInt(12, project.getCategoryId());
            st.executeUpdate();
            ConnectDB.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi tạo project: " + e.getMessage());
        }
    }

//    public int createProject(Project project) {
//        int kq = 0;
//
//        try {
//            Connection con = ConnectDB.getConnection();
//            String sql = "INSERT INTO [dbo].[Project]\n"
//                    + "           ([projectName]\n"
//                    + "           ,[projectTarget]\n"
//                    + "           ,[projectImage]\n"
//                    + "           ,[donatedAmountOfMoney]\n"
//                    + "           ,[projectStatus]\n"
//                    + "           ,[projectDescription]\n"
//                    + "           ,[startDate]\n"
//                    + "           ,[endDate]\n"
//                    + "           ,[isApproved]\n"
//                    + "           ,[userId]\n"
//                    + "           ,[charityOrganizationId]\n"
//                    + "           ,[categoryId])\n"
//                    + "     VALUES\n"
//                    + "           (?,?,?,?,?,?,?,?,?,?,?)";
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setString(1, project.getProjectName());
//            st.setDouble(2, project.getProjectTarget());
//            st.setString(3, null);
//            st.setDouble(4, 0);
//            st.setString(5, "New");
//            st.setString(6, project.getProjectDescription());
//            st.setDate(7, project.getStartDate());
//            st.setDate(8, project.getEndDate());
//            st.setInt(9, 0);
//            st.setInt(10, project.getUserId());
//            st.setInt(11, 0);
//            st.setInt(11, project.getCategoryId());
//            kq = st.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return kq;
//
//    }

    public int updateProject(Project p) {
        int kq = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "UPDATE [dbo].[Project]\n"
                    + "   SET [projectName] = ?\n"
                    + "      ,[projectTarget] = ?\n"
                    + "      ,[projectImage] = ?\n"
                    + "      ,[projectStatus] = ?\n"
                    + "      ,[projectDescription] = ?\n"
                    + "      ,[startDate] = ?\n"
                    + "      ,[endDate] = ?\n"
                    + "      ,[categoryId] = ?\n"
                    + " WHERE projectId = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, p.getProjectName());
            st.setDouble(2, p.getProjectTarget());
            st.setString(3, p.getProjectImage());
            st.setString(4, p.getProjectStatus());
            st.setString(5, p.getProjectDescription());
            st.setDate(6, p.getStartDate());
            st.setDate(7, p.getEndDate());
            st.setInt(8, p.getCategoryId());

            kq = st.executeUpdate();
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public int deleteProjectById(Project p) {
        int kq = 0;
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "DELETE FROM [dbo].[Project]\n"
                    + "      WHERE projectId = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, p.getProjectId());
            kq = st.executeUpdate();
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public Project selectProjectByID(int pid) {
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM Project WHERE projectId = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, pid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Integer projectId = rs.getInt("projectId");
                String name = rs.getString("projectName");
                Double target = rs.getDouble("projectTarget");
                String img = rs.getString("projectImage");
                Double amount = rs.getDouble("donatedAmountOfMoney");
                String status = rs.getString("projectStatus");
                String description = rs.getString("projectDescription");
                Date startDate = rs.getDate("startDate");
                Date endDate = rs.getDate("endDate");
                Integer userId = rs.getInt("userId");
                Integer charityOrganizationId = rs.getInt("charityOrganizationId");
                Integer categoryId = rs.getInt("categoryId");

                Project p = new Project(projectId, name, target, img, amount, status, description, startDate, endDate, userId, charityOrganizationId, categoryId);
                return p;
            }
            ConnectDB.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ProjectDAO pDAO = new ProjectDAO();

    }
}
