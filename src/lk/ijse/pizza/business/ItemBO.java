/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.business;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.dao.custom.impl.CustomerDAOimpl;
import lk.ijse.pizza.dao.custom.impl.ItemDAOimpl;
import lk.ijse.pizza.dto.CustomerDTO;
import lk.ijse.pizza.dto.ItemDTO;
import lk.ijse.pizza.entity.Customer;
import lk.ijse.pizza.entity.Item;

/**
 *
 * @author PAVITHRA
 */
public class ItemBO {
    public static boolean addItem(ItemDTO itemDTO) throws Exception{
        System.out.println("BO : "+itemDTO);
        Item item = new Item(
                itemDTO.getItemID(),
                itemDTO.getItemCode(),
                itemDTO.getName(),
                itemDTO.getDescription(),
                itemDTO.getUnitPrice(),
                itemDTO.getQuantity()
        );
        System.out.println("Entity : " + item);
        return new ItemDAOimpl().addCustomer(item);
    }
    
    public static boolean updateItem(ItemDTO itemDTO) throws Exception{
        Item item = new Item(
                itemDTO.getItemID(),
                itemDTO.getItemCode(),
                itemDTO.getName(),
                itemDTO.getDescription(),
                itemDTO.getUnitPrice(),
                itemDTO.getQuantity()
        );
        return new ItemDAOimpl().updateCustomer(item);
    }
    
     public static boolean deleteItem(int itemID) throws Exception {
        return new ItemDAOimpl().deleteCustomer(itemID);
    }

    public static List<ItemDTO> getAll() throws Exception {
        List<Item> allItems = new ItemDAOimpl().getAll();
        List<ItemDTO> allItemDTOs = new ArrayList<>();
        for (Item item : allItems) {
            ItemDTO itemDTO = new ItemDTO(
                    item.getItemID(),
                    item.getItemCode(),
                    item.getName(),
                    item.getDescription(),
                    item.getUnitPrice(),
                    item.getQuantity()
            );
            allItemDTOs.add(itemDTO);
        }
        return  allItemDTOs;

    }
}
