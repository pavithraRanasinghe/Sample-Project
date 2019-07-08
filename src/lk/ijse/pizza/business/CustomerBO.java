/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Template
 * and open the template in the editor.
 */
package lk.ijse.pizza.business;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.dao.custom.impl.CustomerDAOimpl;
import lk.ijse.pizza.dto.CustomerDTO;
import lk.ijse.pizza.entity.Customer;

/**
 *
 * @author PAVITHRA
 */
public class CustomerBO {

    public static boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        Customer customer = new Customer(
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getContact(),
                customerDTO.getEmail()
        );        
        return new CustomerDAOimpl().addCustomer(customer); 

    }

    public static boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        Customer customer = new Customer(
                customerDTO.getCustomerID(),
                customerDTO.getName(),
                customerDTO.getAddress(),
                customerDTO.getContact(),
                customerDTO.getEmail()
        );
        return new CustomerDAOimpl().updateCustomer(customer);

    }

    public static boolean deleteCustomer(int customerID) throws Exception {
        return new CustomerDAOimpl().deleteCustomer(customerID);
    }

    public static List<CustomerDTO> getAll() throws Exception {
        List<Customer> allCustomers = new CustomerDAOimpl().getAll();
        List<CustomerDTO> allCustomerDTOs = new ArrayList<>();
        for (Customer customer : allCustomers) {
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomerID(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getContact(),
                    customer.getEmail()
            );
            allCustomerDTOs.add(customerDTO);
        }
        return  allCustomerDTOs;

    }
}
