/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.dao;

import com.mycompany.project_sem2.helpers.DatabaseHelper;
import com.mycompany.project_sem2.model.InputService;

import com.mycompany.project_sem2.model.OutputService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi-XV
 */
public class OutputServiceDao {
    
    public boolean insertServiceOut(OutputService inser) throws Exception {
        String sql = "insert into OutputService (NameService,Quantity,Price) values (?,?,?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, inser.getNameService());
            pstmt.setInt(2, inser.getQuantity());
            pstmt.setDouble(3, inser.getPrice());
            
            return pstmt.executeUpdate() > 0;
        }
    } 
    
     public boolean insertWarehouse(OutputService inser) throws Exception {
        String sql = "insert into Warehouse (NameService,Quantity,Price) values (?,?,?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, inser.getNameService());
            pstmt.setInt(2, inser.getQuantity());
            pstmt.setDouble(3, inser.getPrice());
            
            return pstmt.executeUpdate() > 0;
        }
    } 
    
     private void fillOutService(OutputService outputService, final ResultSet rs) throws Exception{
        outputService.setIdServiceOut(rs.getInt("IdServiceOut"));
        outputService.setNameService(rs.getString("NameService"));
        outputService.setQuantity(rs.getInt("Quantity"));
        outputService.setPrice(rs.getDouble("Price"));
        
     }
     
    public OutputService findByNameServiceOut(String nameService)throws Exception{
       String sql = "select * from OutputService where NameService = ? ";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1, nameService);
                OutputService service = null;
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        service = new OutputService();
                        fillOutService(service, rs);
                    }
                }
            return service;
        }
        
    }
    
     public List<OutputService> findAllServiceOut(int idServiceOut) throws Exception {
        String sql = "select * from OutputService ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<OutputService> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    OutputService serviceOut = new OutputService();
                    fillOutService(serviceOut, rs);
                    list.add(serviceOut);
                }
            }
            return list;
        }
    }
     public List<OutputService> findAllWarehouse(String nameService) throws Exception {
        String sql = "select * from Warehouse ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<OutputService> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    OutputService serviceOut = new OutputService();
                    fillOutService(serviceOut, rs);
                    list.add(serviceOut);
                }
            }
            return list;
        }
    }
     
     public boolean updateServiceOut(OutputService outputService) throws Exception {
         String sql = "update OutputService set NameService = ?,Quantity = ?,Price = ?"
                + "Where NameService = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, outputService.getNameService());
            pstmt.setInt(2, outputService.getQuantity());
            pstmt.setDouble(3, outputService.getPrice());
            return pstmt.executeUpdate() > 0;
        }
     }
     public boolean updateWarehouse(OutputService outputService) throws Exception {
         String sql = "update Warehouse set NameService = ?,Quantity = ?,Price = ?"
                + "Where NameService = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, outputService.getNameService());
            pstmt.setInt(2, outputService.getQuantity());
            pstmt.setDouble(3, outputService.getPrice());
            return pstmt.executeUpdate() > 0;
        }
     }
     
     
     
}
