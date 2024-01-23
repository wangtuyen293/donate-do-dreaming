/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class DAO {

    private Connection conn;

    public DAO() {
    }

    public DAO(Connection conn) {
        this.conn = conn;
    }

    public void addUser(User user) {
            String query = "INSERT INTO Users (FullName, UserName, Password, Gender, DateOfBirth, Avatar, Email, PhoneNumber, UserTypeId) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try ( PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, user.getFullName());
                preparedStatement.setString(2, user.getUserName());
                preparedStatement.setString(3, user.getPassword());
                preparedStatement.setInt(4, user.getGender());
                preparedStatement.setDate(5, user.getDateOfBirth());
                preparedStatement.setBytes(6, user.getAvatar()); // Lưu dữ liệu tệp tin ảnh vào cơ sở dữ liệu
                preparedStatement.setString(7, user.getEmail());
                preparedStatement.setString(8, user.getPhoneNumber());
                preparedStatement.setInt(9, user.getUserTypeId());

                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
