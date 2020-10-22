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
public class SettingRoom {
//    private int idRoom,hours,plusHour;
//    private String nameRoom,typeRoom,description;
//    private double price,plusPrice;
    
    public int idRoom,hours,plusHour;
    public String nameRoom,typeRoom,description;
    public double price,plusPrice;
    

    public SettingRoom() {
    }

    public SettingRoom(int idRoom, int hours, int plusHour, String nameRoom, String typeRoom, String description, double price, double plusPrice) {
        this.idRoom = idRoom;
        this.hours = hours;
        this.plusHour = plusHour;
        this.nameRoom = nameRoom;
        this.typeRoom = typeRoom;
        this.description = description;
        this.price = price;
        this.plusPrice = plusPrice;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getPlusHour() {
        return plusHour;
    }

    public void setPlusHour(int plusHour) {
        this.plusHour = plusHour;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPlusPrice() {
        return plusPrice;
    }

    public void setPlusPrice(double plusPrice) {
        this.plusPrice = plusPrice;
    }
    
    
    
}
