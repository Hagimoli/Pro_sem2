/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.model;

import java.sql.Time;

/**
 *
 * @author Hi-XV
 */
public class InputService {
    private int idServerIn,idSupplier,quantity;
    private String nameService,description,nameSupplier,phoneSupplier,address,nameSaler;
    private double price,totalPrice;
    private Time importDate;

    public InputService() {
    }
    public InputService(int idServerIn, int idSupplier, int quantity, String nameService, String description, String nameSupplier, String phoneSupplier, String address, String nameSaler, double price, double totalPrice, Time importDate) {
        this.idServerIn = idServerIn;
        this.idSupplier = idSupplier;
        this.quantity = quantity;
        this.nameService = nameService;
        this.description = description;
        this.nameSupplier = nameSupplier;
        this.phoneSupplier = phoneSupplier;
        this.address = address;
        this.nameSaler = nameSaler;
        this.price = price;
        this.totalPrice = totalPrice;
        this.importDate = importDate;
    }

    public int getIdServerIn() {
        return idServerIn;
    }

    public void setIdServerIn(int idServerIn) {
        this.idServerIn = idServerIn;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public String getPhoneSupplier() {
        return phoneSupplier;
    }

    public void setPhoneSupplier(String phoneSupplier) {
        this.phoneSupplier = phoneSupplier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameSaler() {
        return nameSaler;
    }

    public void setNameSaler(String nameSaler) {
        this.nameSaler = nameSaler;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Time getImportDate() {
        return importDate;
    }

    public void setImportDate(Time importDate) {
        this.importDate = importDate;
    }
    
    
}
