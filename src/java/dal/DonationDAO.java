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
import model.Donation;
import model.User;

/**
 *
 * @author VanHuy
 */
public class DonationDAO {

    public ArrayList<Donation> getAllDonation() {
        ArrayList<Donation> dlist = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "SELECT [donationId]\n"
                    + "      ,[amountOfMoney]\n"
                    + "      ,[donationTime]\n"
                    + "      ,[receiveGift]\n"
                    + "      ,[userId]\n"
                    + "      ,[projectId]\n"
                    + "      ,[paymentMethodId]\n"
                    + "      ,[giftId]\n"
                    + "  FROM [dbo].[Donation]";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Integer donationId = rs.getInt("donationId");
                Date donationTime = rs.getDate("donationTime");
                String receiveGift = rs.getString("receiveGift");
                Integer userId = rs.getInt("userId");
                Integer projectId = rs.getInt("projectId");
                Integer paymentMethodId = rs.getInt("paymentMethodId");
                Integer giftId = rs.getInt("giftId");
                Double amountOfMoney = rs.getDouble("amountOfMoney");
                Donation d = new Donation(donationId, projectId, userId, giftId, paymentMethodId, amountOfMoney, donationTime, receiveGift);
                dlist.add(d);
            }
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dlist;
    }

    public ArrayList<Donation> getAllDonationInfo() {
        ArrayList<Donation> dlist = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "SELECT * FROM [dbo].[Donation]";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userId");
                int projectID = rs.getInt("projectId");
                int donationID = rs.getInt("donationId");
                double amountOfMoney = rs.getDouble("amountOfMoney");
                Date donationTime = rs.getDate("donationTime");
                UserDAO uDAO = new UserDAO();
                User user = uDAO.selectUserById(userID);
                Donation d = new Donation(donationID, projectID, userID, amountOfMoney, donationTime, user);
                dlist.add(d);
            }
        } catch (SQLException e) {
        }
        return dlist;
    }

    public static void main(String[] args) {
        DonationDAO d = new DonationDAO();
        ArrayList<Donation> list = d.getAllDonationInfo();
        System.out.println(list.get(0).getUser());
    }
}
