/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Project;
import model.ProjectProcess;

/**
 *
 * @author VanHuy
 */
public class ProjectProcessDAO {

    public int updateProjectProcess(ProjectProcess pp) {
        int kq = 0;
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "INSERT INTO [dbo].[ProjectProcess]\n"
                    + "           ([updateDate]\n"
                    + "           ,[planOfPhase]\n"
                    + "           ,[moneyCost]\n"
                    + "           ,[image]\n"
                    + "           ,[description]\n"
                    + "           ,[projectId])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setDate(1, pp.getUpdateDate());
            st.setString(2, pp.getPlanOfPhase());
            st.setDouble(3, pp.getMoneyCost());
            st.setString(4, pp.getImage());
            st.setString(5, pp.getDescription());
            st.setInt(6, pp.getProject().getProjectId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

}
