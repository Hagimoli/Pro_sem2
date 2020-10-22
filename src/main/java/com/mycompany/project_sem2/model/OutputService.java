/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.model;

/**
 *
 * @author Hi-XV
 */
public class OutputService extends DetailRoom{
//    private int idServiceOut,quantity;
//    private String NameService;
//    private double price;
    
    public int idServiceOut,quantity;
    public String NameService;
    public double price;
            
    public OutputService() {
    }

    public OutputService(int idServiceOut, int quantity, String NameService, double price) {
        this.idServiceOut = idServiceOut;
        this.quantity = quantity;
        this.NameService = NameService;
        this.price = price;
    }

    public int getIdServiceOut() {
        return idServiceOut;
    }

    public void setIdServiceOut(int idServiceOut) {
        this.idServiceOut = idServiceOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameService() {
        return NameService;
    }

    public void setNameService(String NameService) {
        this.NameService = NameService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
