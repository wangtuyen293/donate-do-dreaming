package dao;

import db.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DonatorAddress;
import model.User;

public class DAO extends DBContext {

    public DAO() {

    }

    public void addUser(User user) throws Exception {
        try {
            String sql = "INSERT INTO Users (fullName, userName, password, gender, dateOfBirth, avatar, email, phoneNumber, userTypeId) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setNull(1, java.sql.Types.VARCHAR);
                preparedStatement.setString(2, user.getUserName());
                preparedStatement.setString(3, user.getPassword());
                preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                preparedStatement.setNull(5, java.sql.Types.DATE);
                preparedStatement.setNull(6, java.sql.Types.VARCHAR);
                preparedStatement.setString(7, user.getEmail());
                preparedStatement.setNull(8, java.sql.Types.VARCHAR);
                preparedStatement.setNull(9, java.sql.Types.INTEGER);
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User login(String username, String password) throws Exception {
        try {
            String query = "SELECT * FROM Users WHERE userName=? AND password=?";
            try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return new User(
                                resultSet.getString("fullName"),
                                resultSet.getString("userName"),
                                resultSet.getString("password"),
                                resultSet.getInt("gender"),
                                resultSet.getDate("dateOfBirth"),
                                resultSet.getString("avatar"),
                                resultSet.getString("email"),
                                resultSet.getString("phoneNumber"),
                                resultSet.getInt("userTypeId")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean updateUserProfile(User user) throws Exception {
        String query = "UPDATE Users SET fullName=?, gender=?, dateOfBirth=?,email=?, phoneNumber=?, avatar=? WHERE username=?";
        boolean success = false;

        try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPhoneNumber());
            preparedStatement.setInt(2, user.getGender());
            preparedStatement.setDate(3, user.getDateOfBirth());
            preparedStatement.setString(6, user.getAvatar());
            preparedStatement.setString(7, user.getUserName());
            int rowsUpdated = preparedStatement.executeUpdate();
            success = (rowsUpdated > 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return success;
    }

    public User getUserByUsername(String username) throws Exception {
        try {
            String query = "SELECT * FROM Users WHERE userName=? ";
            try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, username);
                try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return new User(
                                resultSet.getString("fullName"),
                                resultSet.getString("userName"),
                                resultSet.getString("password"),
                                resultSet.getInt("gender"),
                                resultSet.getDate("dateOfBirth"),
                                resultSet.getString("avatar"),
                                resultSet.getString("email"),
                                resultSet.getString("phoneNumber"),
                                resultSet.getInt("userTypeId")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean checkCurrentPassword(String username, String currentPassword) throws Exception {
        String query = "SELECT password FROM Users WHERE userName = ?";
        try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);

            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String storedPassword = resultSet.getString("password");
                    return currentPassword.equals(storedPassword);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void updatePassword(String username, String newPassword) throws Exception {
        String query = "UPDATE Users SET password = ? WHERE userName = ?";
        try ( Connection connection = getConnection();  PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addDonatorAddress(DonatorAddress donatorAddress) throws SQLException {
        String sql = "INSERT INTO DonatorAddress (fullName, phoneNumber, email, province, addressDetail, userId) VALUES (?, ?, ?, ?, ?, ?)";
        try ( Connection connection = getConnection();  PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, donatorAddress.getFullName());
            statement.setString(2, donatorAddress.getPhoneNumber());
            statement.setString(3, donatorAddress.getEmail());
            statement.setString(4, donatorAddress.getProvince());
            statement.setString(5, donatorAddress.getAddressDetail());
            statement.setInt(6, donatorAddress.getUserId());

            statement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
