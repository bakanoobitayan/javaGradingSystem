package project;
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
