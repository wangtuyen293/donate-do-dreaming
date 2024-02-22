/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UserType;

/**
 *
 * @author VanHuy
 */
public class UserTypeDAO {
       public List<UserType> getAllUserType() {
          ArrayList<UserType> list = new ArrayList<>();
          try {
              Connection con = ConnectDB.getConnection();
              String sql = "select * from UserType";
              PreparedStatement st = con.prepareStatement(sql);
              ResultSet rs = st.executeQuery();
              while (rs.next()){
                  int id = rs.getInt("userTypeId");
                  String name = rs.getString("userTypeName");
                  UserType ut = new UserType(id, name);
                  list.add(ut);
              }
          } catch (SQLException e) {
          }
        return list;
    }
    
    public static void main(String[] args) {
        UserTypeDAO c = new UserTypeDAO();
        List<UserType> list = c.getAllUserType();
        System.out.println(list.get(2).getUserTypeId());
        System.out.println(list.get(2).getUserTypeName());
    }
}
