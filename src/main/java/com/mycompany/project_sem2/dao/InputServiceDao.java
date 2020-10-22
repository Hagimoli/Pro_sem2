/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.dao;

import com.mycompany.project_sem2.helpers.DatabaseHelper;
import com.mycompany.project_sem2.model.InputService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi-XV
 */
public class InputServiceDao {
    
//INSERT
   public boolean insertService(InputService inputService) throws Exception {
        String sql = "insert into InputService (NameService,Quantity,Price,TotalPrice,Description,ImportDate,NameSupplier) values (?,?,?,?,?,?,?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, inputService.getNameService());
            pstmt.setInt(2, inputService.getQuantity());
            pstmt.setDouble(3, inputService.getPrice());
            pstmt.setDouble(4, inputService.getTotalPrice());
            pstmt.setString(5, inputService.getDescription());
            pstmt.setTime(6, inputService.getImportDate());
            pstmt.setString(7, inputService.getNameSupplier());
            
            
            return pstmt.executeUpdate() > 0;
        }
    }
   
   public boolean insertSupplier(InputService inputService) throws Exception {
        String sql =  " insert into ServiceSupplier (NameSupplier,PhoneSupplier,Address,NameSaler ) values (?,?,?,?)"
                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, inputService.getNameSupplier());
            pstmt.setString(2, inputService.getPhoneSupplier());
            pstmt.setString(3, inputService.getAddress());
            pstmt.setString(4, inputService.getNameSaler());
            
            
            return pstmt.executeUpdate() > 0;
        }
    }
//FIND 
   private void fillInputService(InputService inputService, final ResultSet rs) throws Exception{
        inputService.setIdServerIn(rs.getInt("IdServiceIn"));
        inputService.setIdSupplier(rs.getInt("IdSupplier"));
        inputService.setAddress(rs.getString("Address"));
        inputService.setDescription(rs.getString("Description"));
        inputService.setImportDate(rs.getTime("ImportDate"));
        inputService.setNameSaler(rs.getString("NameSaler"));
        inputService.setNameService(rs.getString("NameService"));
        inputService.setNameSupplier(rs.getString("NameSupplier"));
        inputService.setPhoneSupplier(rs.getString("PhoneSupplier"));
        inputService.setPrice(rs.getDouble("Price"));
        inputService.setTotalPrice(rs.getDouble("TotalPrice"));
        inputService.setQuantity(rs.getInt("Quantity"));
               
    }
   
   private void fillSupplier(InputService inputService, final ResultSet rs) throws Exception{
        
        inputService.setIdSupplier(rs.getInt("IdSupplier"));
        inputService.setAddress(rs.getString("Address"));
        
        
        inputService.setNameSaler(rs.getString("NameSaler"));
        
        inputService.setNameSupplier(rs.getString("NameSupplier"));
        inputService.setPhoneSupplier(rs.getString("PhoneSupplier"));
        
               
    }
   
    public List<InputService> findByNameSupplier(String nameSupplier)throws Exception{
       String sql = "select * from ServiceSupplier where namesupplier like ? ";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1, "%" + nameSupplier + "%");
                List<InputService> list = new ArrayList<>();
                
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                       InputService inputService = new InputService();
                        fillSupplier(inputService, rs);
                        list.add(inputService);
                    }
                }
            return list;
            
        }
        
    }
    
    public List<InputService> showNameSupplier()throws Exception{
       String sql = "select NameSupplier from ServiceSupplier  ";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                
                List<InputService> list = new ArrayList<>();
                
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                       InputService inputService = new InputService();
                        inputService.setNameSupplier(rs.getString("NameSupplier"));
                        list.add(inputService);
                    }
                }
            return list;
            
        }
        
    }
    
    
//DELETE
    public boolean deleteServiceIn(int idServiceIn) throws Exception {
        String sql = "delete from InputService where IdServiceIn = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, idServiceIn);

            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean deleteSupplier(int idSupplier) throws Exception {
        String sql = "delete from ServiceSupplier where IdSupplier = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, idSupplier);

            return pstmt.executeUpdate() > 0;
        }
    }
      
//UPDATE
     public boolean updateSupplier(InputService inputService) throws Exception {
         String sql = "update ServiceSupplier set NameSupplier = ?,PhoneSupplier = ?,Address = ?,NameSaler = ? Where IdSupplier = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, inputService.getNameSupplier());
            pstmt.setString(2, inputService.getPhoneSupplier());
            pstmt.setString(3, inputService.getAddress());
            pstmt.setString(4, inputService.getNameSaler());
            pstmt.setInt(5, inputService.getIdSupplier());
            return pstmt.executeUpdate() > 0;
        }
     }
     
//PHAN NAY KO BIET LAM    
     public boolean updateSupplierFree(InputService inputService) throws Exception {
         String sql = "update ServiceSupplier set ? = ?"
                + "Where NameSupplier = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            
//            try(ResultSet rs = pstmt.executeQuery){
//                    
//                    if( pstmt.setString(1,getString("NameSupplier"))){
////                        inputService = new InputService();
////                        fillInputService(inputService, rs);
//                        pstmt.setString(2, inputService.getNameSupplier());
//                    }
//                }
            
            pstmt.setString(1, "NameSupplier");
            pstmt.setString(2, inputService.getNameSupplier());
            pstmt.setString(3, inputService.getNameSupplier());
//            pstmt.setString(4, inputService.getPhoneSupplier());
//            pstmt.setString(5, inputService.getNameService());
            return pstmt.executeUpdate() > 0;
        }
     }
    
    public boolean updateService(InputService inputService) throws Exception {
         String sql = "update InputService set NameService = ?,Quantity = ?,Price = ?,TotalPrice = ?,Description = ?,ImportDate = ?, NameSupplier = ?"
                + "Where NameService = ? and IdServiceIn = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, inputService.getNameService());
            pstmt.setInt(2, inputService.getQuantity());
            pstmt.setDouble(3, inputService.getPrice());
            pstmt.setDouble(4, inputService.getTotalPrice());
            pstmt.setString(5, inputService.getDescription());
            pstmt.setTime(6, inputService.getImportDate());
            pstmt.setString(7, inputService.getNameSupplier());
            pstmt.setString(8, inputService.getNameService());
            pstmt.setInt(9, inputService.getIdServerIn());
            return pstmt.executeUpdate() > 0;
        }
     }
//DISPLAY ALL    
    public List<InputService> findAllServiceIn() throws Exception {
        String sql = "select * from InputService ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<InputService> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    InputService serviceIn = new InputService();
                    fillInputService(serviceIn, rs);
                    list.add(serviceIn);
                }
            }
            return list;
        }
    }
    
    public List<InputService> findAllSupplier() throws Exception {
        String sql = "select * from ServiceSupplier ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<InputService> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    InputService supplier = new InputService();
                    fillInputService(supplier, rs);
                    list.add(supplier);
                }
            }
            return list;
        }
    }
    
}
