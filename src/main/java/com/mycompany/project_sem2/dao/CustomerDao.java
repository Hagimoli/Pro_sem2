/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.dao;

import com.mycompany.project_sem2.helpers.DatabaseHelper;
import com.mycompany.project_sem2.model.Customer;
import com.mycompany.project_sem2.model.InputService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi-XV
 */
public class CustomerDao {
    
    
    public boolean insertCustomer(Customer inser) throws Exception {
        String sql = "insert into Customer (NameCustomer,PhoneNumberC,IdCard,Address,BirthDate,FileImage,Note) values (?,?,?,?,?,?,?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, inser.getNameCustomer());
            pstmt.setString(2, inser.getPhoneNumberC());
            pstmt.setString(3, inser.getIdCard());
            pstmt.setString(4, inser.getAddress());
            pstmt.setTime(5, inser.getBirthDate());
            pstmt.setString(6, inser.getFileImage());
            pstmt.setString(7, inser.getNote());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    private void fillCustomer(Customer customer, final ResultSet rs) throws Exception{
        customer.setIdCustomer(rs.getInt("IdCustomer"));
        customer.setNameCustomer(rs.getString("NameCustomer"));
        customer.setPhoneNumberC(rs.getString("PhoneNumberC"));
        customer.setIdCard(rs.getString("IdCard"));
        customer.setAddress(rs.getString("Address"));
        customer.setBirthDate(rs.getTime("BirthDate"));
        customer.setFileImage(rs.getString("FileImage"));
        customer.setNote(rs.getString("Note"));
    }
    
    public Customer findByIdCard(String idCard)throws Exception{
       String sql = "select * from Customer where IdCard = ? ";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1, idCard);
                Customer customer = null;
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        customer = new Customer();
                        fillCustomer(customer, rs);
                    }
                }
            return customer;
        }
        
    }
    
    public boolean deleteCustomer(String idCard) throws Exception {
        String sql = "delete from Customer where IdCard = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, idCard );

            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean deleteCustomerByPhone(String phoneNumberC) throws Exception {
        String sql = "delete from Customer where PhoneNumberC = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, phoneNumberC );

            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean updateCustomer(Customer customer) throws Exception {
         String sql = "update ServiceSupplier set NameCustomer = ?,PhoneNumberC = ?,IdCard = ?,Address = ?,BirthDate = ?,FileImage = ?,Note = ?"
                + "Where PhoneNumberC = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, customer.getNameCustomer());
            pstmt.setString(2, customer.getPhoneNumberC());
            pstmt.setString(3, customer.getIdCard());
            pstmt.setString(4, customer.getAddress());
            pstmt.setTime(5, customer.getBirthDate());
            pstmt.setString(6, customer.getFileImage());
            pstmt.setString(7, customer.getNote());
            pstmt.setString(8, customer.getPhoneNumberC());
            return pstmt.executeUpdate() > 0;
        }
     }
    public List<Customer> findAllCustomerr(int idCustomer) throws Exception {
        String sql = "select * from InputService ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<Customer> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Customer customerr = new Customer();
                    fillCustomer(customerr , rs);
                    list.add(customerr);
                }
            }
            return list;
        }
    }
}
