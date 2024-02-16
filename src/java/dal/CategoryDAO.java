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

import model.Category;

/**
 *
 * @author VanHuy
 */
public class CategoryDAO {

    public ArrayList<Category> getAllCategory() {
        ArrayList<Category> clist = new ArrayList<>();
        try {
            Connection conn = ConnectDB.getConnection();
            String sql = "SELECT [categoryId]\n"
                    + "      ,[categoryName]\n"
                    + "      ,[categoryDescription]\n"
                    + "      ,[imgCategory]\n"
                    + "  FROM [dbo].[Category]";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("categoryId");
                String name = rs.getString("categoryName");
                String description = rs.getString("categoryDescription");
                String img = rs.getString("imgCategory");
                Category c = new Category(id, name, description, img);
                clist.add(c);
            }
            ConnectDB.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clist;
    }

    public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        ArrayList<Category> list = c.getAllCategory();
        System.out.println(list.get(0).getCategoryName());
    }
}
