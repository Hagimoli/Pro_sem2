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
public class Customer {
//    private int idCustomer;
//    private  String nameCustomer,phoneNumberC, idCard, address, fileImage,note;
//    private Time birthDate;
    public int idCustomer;
    public String nameCustomer,phoneNumberC, idCard, address, fileImage,note;
    public Time birthDate;
    public Customer() {
    }

    public Customer(int idCustomer, String nameCustomer, String phoneNumberC, String idCard, String address, String fileImage, String note, Time birthDate) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneNumberC = phoneNumberC;
        this.idCard = idCard;
        this.address = address;
        this.fileImage = fileImage;
        this.note = note;
        this.birthDate = birthDate;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumberC() {
        return phoneNumberC;
    }

    public void setPhoneNumberC(String phoneNumberC) {
        this.phoneNumberC = phoneNumberC;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFileImage() {
        return fileImage;
    }

    public void setFileImage(String fileImage) {
        this.fileImage = fileImage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Time getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Time birthDate) {
        this.birthDate = birthDate;
    }

    
    
}
