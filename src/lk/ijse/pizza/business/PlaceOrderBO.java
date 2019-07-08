/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.business;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.pizza.dao.custom.impl.ItemDAOimpl;
import lk.ijse.pizza.dto.ItemDTO;
import lk.ijse.pizza.entity.Item;

/**
 *
 * @author PAVITHRA
 */
public class PlaceOrderBO {
    public static List<ItemDTO> getMenu() throws Exception{
        List<Item> menu = new ItemDAOimpl().getAll();
        List<ItemDTO> menuArray = new ArrayList<>();
        for (Item item : menu) {
            ItemDTO itemMenuDTO = new ItemDTO();
            itemMenuDTO.setName(item.getName());
            itemMenuDTO.setDescription(item.getDescription());
            itemMenuDTO.setQuantity(item.getQuantity());
            
            menuArray.add(itemMenuDTO);
        }
        return menuArray;
    }
}
