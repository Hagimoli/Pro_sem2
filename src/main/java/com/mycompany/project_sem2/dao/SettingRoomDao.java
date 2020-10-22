/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.dao;

import com.mycompany.project_sem2.helpers.DatabaseHelper;
import com.mycompany.project_sem2.model.Customer;
import com.mycompany.project_sem2.model.SettingRoom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi-XV
 */
public class SettingRoomDao {
    
    
     public boolean insertRoom(SettingRoom settingRoom) throws Exception {
        String sql = "insert into Room (IdRoom,NameRoom,TypeRoom,Description) values (?,?,?,?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, settingRoom.getIdRoom());
            pstmt.setString(2, settingRoom.getNameRoom());
            pstmt.setString(3, settingRoom.getTypeRoom());
            pstmt.setString(4, settingRoom.getDescription());
            
            
            return pstmt.executeUpdate() > 0;
        }
    }
     
     public boolean insertTypesPriceRoom(SettingRoom settingRoom) throws Exception {
        String sql = "insert into TypesPriceRoom (TypeRoom,Hours,Price,PlusHour,PlusPrice) values (?,?,?,?.?)"
                                ;
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, settingRoom.getTypeRoom());
            pstmt.setInt(2, settingRoom.getHours());
            pstmt.setDouble(3, settingRoom.getPrice());
            pstmt.setInt(4, settingRoom.getPlusHour());
            pstmt.setDouble(5, settingRoom.getPlusPrice());
            
            
            return pstmt.executeUpdate() > 0;
        }
    }
     
     private void fillSettingRoom(SettingRoom settingRoom, final ResultSet rs) throws Exception{
        settingRoom.setIdRoom(rs.getInt("IdRoom"));
        settingRoom.setHours(rs.getInt("Hours"));
        settingRoom.setNameRoom(rs.getString("NameRoom"));
        settingRoom.setDescription(rs.getString("Description"));
        settingRoom.setTypeRoom(rs.getString("TypeRoom"));
        settingRoom.setPlusHour(rs.getInt("PlusHour"));
        settingRoom.setPrice(rs.getDouble("Price"));
        settingRoom.setPlusPrice(rs.getInt("PlusPrice"));
    }
     
     public boolean deleteRoom(int idRoom) throws Exception {
        String sql = "delete from Room where IdRoom = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, idRoom );

            return pstmt.executeUpdate() > 0;
        }
    }
     
     public boolean deleteTypesPriceRoom(String typeRoom) throws Exception {
        String sql = "delete from Room where TypeRoom = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, typeRoom );

            return pstmt.executeUpdate() > 0;
        }
    }
     
     public boolean updateRoom(SettingRoom settingRoom) throws Exception {
         String sql = "update Room set IdRoom = ?,NameRoom = ?,TypeRoom = ?,Description = ?"
                + "Where IdRoom = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setInt(1, settingRoom.getIdRoom());
            pstmt.setString(2, settingRoom.getNameRoom());
            pstmt.setString(3, settingRoom.getTypeRoom());
            pstmt.setString(4, settingRoom.getDescription());
            pstmt.setInt(5, settingRoom.getIdRoom());
            return pstmt.executeUpdate() > 0;
        }
     }
     
     public boolean updateTypesPriceRoom(SettingRoom settingRoom) throws Exception {
         String sql = "update TypesPriceRoom set TypeRoom = ?,Hours = ?,Price = ?,PlusHour = ?,PlusPrice = ?"
                + "Where TypeRoom = ? and Hours= ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);){
            pstmt.setString(1, settingRoom.getTypeRoom());
            pstmt.setInt(2, settingRoom.getHours());
            pstmt.setDouble(3, settingRoom.getPrice());
            pstmt.setInt(4, settingRoom.getPlusHour());
            pstmt.setDouble(5, settingRoom.getPlusPrice());
            pstmt.setString(6, settingRoom.getTypeRoom());
            pstmt.setInt(7, settingRoom.getHours());
            return pstmt.executeUpdate() > 0;
        }
     }
     
      public List<SettingRoom> findAllRoom(int idRoom) throws Exception {
        String sql = "select * from Room ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<SettingRoom> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    SettingRoom room = new SettingRoom();
                    fillSettingRoom(room , rs);
                    list.add(room);
                }
            }
            return list;
        }
    }
      
    public List<SettingRoom> findAllTypesPriceRoom(String typeRoom) throws Exception {
        String sql = "select * from TypesPriceRoom ";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            List<SettingRoom> list = new ArrayList<>();

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    SettingRoom room = new SettingRoom();
                    fillSettingRoom(room , rs);
                    list.add(room);
                }
            }
            return list;
        }
    }  
     
}
