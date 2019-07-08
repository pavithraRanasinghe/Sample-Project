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
public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String contact;
    private String email;

    public Customer() {
    }

    public Customer(int customerID, String name, String address, String contact, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public Customer(String name, String address, String contact, String email) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email=" + email + '}';
    }
    
    
}
