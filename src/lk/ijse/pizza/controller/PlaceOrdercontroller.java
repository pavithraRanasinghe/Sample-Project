/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.controller;

import java.util.List;
import lk.ijse.pizza.business.PlaceOrderBO;
import lk.ijse.pizza.dto.ItemDTO;

/**
 *
 * @author PAVITHRA
 */
public class PlaceOrdercontroller {
    public static List<ItemDTO> getMenu () throws Exception{
        return PlaceOrderBO.getMenu();
    }
}
