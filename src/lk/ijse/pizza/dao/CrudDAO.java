/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.dao;

import java.sql.SQLException;
import java.util.List;
import lk.ijse.pizza.entity.Customer;

/**
 *
 * @author PAVITHRA
 */
public interface CrudDAO<T,ID>extends SuperDAO{
    public boolean addCustomer(T t) throws SQLException, Exception;
    
    public boolean updateCustomer(T t) throws Exception;
    
    public boolean deleteCustomer(ID id) throws Exception;
    
    public List<T> getAll() throws Exception;
}
