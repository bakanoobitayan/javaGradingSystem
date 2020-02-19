/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egui;

/**
 *
 * @author AcctgLaptop
 */
import java.sql.*;
/**
 *
 * @author student
 */
public class DBKonek {
        public  Connection DBKonek () {
         String DbServer="jdbc:mysql://localhost/sampledb";
         String Username= "root";
         String Passwd = "";
         String Driver="com.mysql.jdbc.Driver";
        
         Connection conn= null; 
         
         try {
            
             conn= DriverManager.getConnection(DbServer,Username,Passwd);
         
         }
         catch (SQLException e) {e.printStackTrace();
         }
         return conn;
    }
        
}