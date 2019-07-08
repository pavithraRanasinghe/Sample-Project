/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.business.ItemBO;
import lk.ijse.pizza.configuration.DBConnection;
import lk.ijse.pizza.dto.ItemDTO;

/**
 *
 * @author PAVITHRA
 */
public class ItemController {

    public static boolean addItem(ItemDTO itemDTO) throws Exception {
        return ItemBO.addItem(itemDTO);
    }
    
    public static List<ItemDTO> getAll() throws Exception{
        return ItemBO.getAll();
    }
    
    public static boolean updateItem(ItemDTO itemDTO) throws Exception{
        return ItemBO.updateItem(itemDTO);
    }
    
    public static boolean deleteItem(int itemID) throws Exception{
       return ItemBO.deleteItem(itemID);
    }
}   
