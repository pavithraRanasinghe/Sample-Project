/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pizza.entity;

/**
 *
 * @author PAVITHRA
 */
public class Item {
    private int itemID;
    private String itemCode;
    private String name;
    private String description;
    private double unitPrice;
    private int quantity;

    public Item() {
    }

    public Item(int itemID, String itemCode, String name, String description, double unitPrice, int quantity) {
        this.itemID = itemID;
        this.itemCode = itemCode;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

   
   

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", itemCode=" + itemCode + ", name=" + name + ", description=" + description + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }
    
    

   
    
}
