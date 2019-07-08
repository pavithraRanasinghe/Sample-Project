/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.configuration.DBConnection;
import lk.ijse.pizza.dao.custom.ItemDAO;
import lk.ijse.pizza.dto.ItemDTO;
import lk.ijse.pizza.entity.Item;

/**
 *
 * @author PAVITHRA
 */
public class ItemDAOimpl implements ItemDAO{

    @Override
    public boolean addCustomer(Item t) throws SQLException, Exception {
        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, 0);
        stm.setObject(2, t.getItemCode());
        stm.setObject(3, t.getName());
        stm.setObject(4, t.getDescription());
        stm.setObject(5, t.getUnitPrice());
        stm.setObject(6, t.getQuantity());

        int executeUpdate = stm.executeUpdate();
        System.out.println("Add : " + executeUpdate);
        return executeUpdate > 0;
    }

    @Override
    public boolean updateCustomer(Item t) throws Exception {
        String sql = "UPDATE item SET itemCode=?,name=?,description=?,unitPrice=?,quantity=? WHERE itemID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, t.getItemCode());
        stm.setObject(2, t.getName());
        stm.setObject(3, t.getDescription());
        stm.setObject(4, t.getUnitPrice());
        stm.setObject(5, t.getQuantity());
        stm.setObject(6, t.getItemID());
        
        int executeUpdate = stm.executeUpdate();
        return executeUpdate>0;
    }

    @Override
    public boolean deleteCustomer(Integer id) throws Exception {
        String sql = "DELETE FROM item WHERE itemID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, id);
        int executeUpdate = stm.executeUpdate();
        return executeUpdate>0;
    }

    @Override
    public List<Item> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM item");        
        List<Item> arrayList = new ArrayList<>();
        while (rst.next()) {            
            Item items = new Item();
            items.setItemID(rst.getInt(1));
            items.setItemCode(rst.getString(2));
            items.setName(rst.getString(3));
            items.setDescription(rst.getString(4));
            items.setUnitPrice(rst.getDouble(5));
            items.setQuantity(rst.getInt(6));
            arrayList.add(items);
        }
        return arrayList;
    }
    
}
