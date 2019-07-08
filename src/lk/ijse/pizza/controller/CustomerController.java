/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.controller;

import lk.ijse.pizza.view.CustomerForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.business.CustomerBO;
import lk.ijse.pizza.configuration.DBConnection;
import lk.ijse.pizza.dto.CustomerDTO;

/**
 *
 * @author PAVITHRA
 */
public class CustomerController {

    public static boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return CustomerBO.addCustomer(customerDTO);
    }

    public static List<CustomerDTO> getAll() throws Exception {
        return CustomerBO.getAll();
    }

    public static boolean updateCustomer(CustomerDTO customerDTO) throws Exception {        
        return CustomerBO.updateCustomer(customerDTO);
    }

    public static boolean deleteCustomer(int customerID) throws Exception {
        return CustomerBO.deleteCustomer(customerID);
                
    }
}
