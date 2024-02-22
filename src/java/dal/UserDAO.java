/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author VanHuy
 */
public class UserDAO {

    public ArrayList<User> getAllUsers() {
        ArrayList<User> ulist = new ArrayList<>();
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT [userId]\n"
                    + "      ,[fullName]\n"
                    + "      ,[gender]\n"
                    + "      ,[dateOfBirth]\n"
                    + "      ,[email]\n"
                    + "      ,[phoneNumber]\n"
                    + "  FROM [dbo].[Users]";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String name = rs.getString("fullName");
                Integer gender = rs.getInt("gender");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                User u = new User(name, gender, dateOfBirth, email, email, phoneNumber);
                ulist.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ulist;
    }

    //getfullNamebydid
    //getemailbydid
    //getphonenumberbydid
    public User selectUserById(int userName) {
        try {
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT [userId]\n"
                    + "      ,[fullName]\n"
                    + "      ,[gender]\n"
                    + "      ,[dateOfBirth]\n"
                    + "      ,[avatar]\n"
                    + "      ,[email]\n"
                    + "      ,[phoneNumber]\n"
                    + "  FROM [dbo].[Users]";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, userName);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userId");
                String name = rs.getString("fullName");
                int gender = rs.getInt("gender");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                String avatar = rs.getString("avatar");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                User u = new User(userID, name, gender, dateOfBirth, avatar, email, phoneNumber);
                return u;
            }
            ConnectDB.closeConnection(con);
        } catch (SQLException e) {
        }
        return null;
    }

    public static void main(String[] args) {
        UserDAO u = new UserDAO();
        List<User> list = u.getAllUsers();
        System.out.println(list.get(0).getUserTypeId());
    }
}
