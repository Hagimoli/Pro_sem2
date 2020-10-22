/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_sem2.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hi-XV
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=MotelManager;";  
            Connection con = DriverManager.getConnection(connectionUrl,"sa","0123");
            
            return con;
    }//
}
