/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sanda
 */
public class DBconnect {
    
     public static Connection ConnectDb(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/shapedb","root","");
           
            System.out.println("connected");
            return conn;    
        }
        catch(Exception e){
            System.out.println("error:"+e);
            return null;
            
            
        }
        
    }
    
}
