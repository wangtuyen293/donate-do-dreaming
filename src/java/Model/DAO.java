/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class DAO {

    public void addUser(User user) {
        try {
            String query = "INSERT INTO Users (fullName, userName, password, gender, dateOfBirth, avatar, email, phoneNumber,userTypeName) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection connection = new DBContext().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setInt(4, user.getGender());
            preparedStatement.setDate(5, user.getDateOfBirth());
            preparedStatement.setBytes(6, user.getAvatar());
            preparedStatement.setString(7, user.getEmail());
            preparedStatement.setString(8, user.getPhoneNumber());
            preparedStatement.setString(9, "User");
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public User getUser(String username, String pass) {

        try {
            String query = "select * from User where userName=? and password=?";
            Connection connection = new DBContext().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, pass);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()) {
                byte[] avatarBytes = res.getBytes(6);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date dateOfBirth = (Date) dateFormat.parse(res.getString(5));
                return new User(res.getString(1), res.getString(2), res.getString(3),
                        res.getInt(4), dateOfBirth, avatarBytes,
                        res.getString(7), res.getString(8), res.getString(9));
            }
            res.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }
}
