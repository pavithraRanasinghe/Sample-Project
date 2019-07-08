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
import lk.ijse.pizza.dao.custom.CustomerDAO;
import lk.ijse.pizza.dto.CustomerDTO;
import lk.ijse.pizza.entity.Customer;

/**
 *
 * @author PAVITHRA
 */
public class CustomerDAOimpl implements CustomerDAO {
    
    @Override
    public boolean addCustomer(Customer customer) throws SQLException, Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("insert into customer values (?,?,?,?,?) ");
        stm.setObject(1, 0);
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getContact());
        stm.setObject(5, customer.getEmail());
        
        int executeUpdate = stm.executeUpdate();
        return executeUpdate > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        String sql = "UPDATE customer set name=?,address=?,contact=?,email=? where customerID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, customer.getName());
        stm.setObject(2, customer.getAddress());
        stm.setObject(3, customer.getContact());
        stm.setObject(4, customer.getEmail());
        stm.setObject(5, customer.getCustomerID());        
        
        int executeUpdate = stm.executeUpdate();
        return executeUpdate>0;
    }

    @Override
    public boolean deleteCustomer(Integer customerID) throws Exception {
        String sql = "DELETE FROM customer WHERE customerID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1,customerID);
        int executeUpdate = stm.executeUpdate();
        return executeUpdate>0;
    }
    @Override
    public List<Customer> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Customer");
        List<Customer> customers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rst.getInt(1));
            customer.setName(rst.getString(2));
            customer.setAddress(rst.getString(3));
            customer.setContact(rst.getString(4));
            customer.setEmail(rst.getString(5));
            
            customers.add(customer);
        }
        return customers;
    }


}

