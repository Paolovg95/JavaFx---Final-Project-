/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paolovargas1
 */
public class DBConnection {
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root"; // username 
    private static final String password = "password"; // password 
    private static final String url = "jdbc:mysql://localhost:3306/UsersSB"; // host or url 

    
    public DBConnection(){ // create Constructor
        con = null;
        try {
            Class.forName(driver); 
            con = DriverManager.getConnection(url, user, password); // open DataBase Connection 
            if( con!=null){
                System.out.println("Connection Successful");
            }
        } catch (ClassNotFoundException | SQLException e ){
            System.out.println("Connection ERROR");
        }
    }
    public  Connection getConnection(){ // method to call it from any class. returning the connection 
        return con;
    }
    public void disconnect(){
        con = null;
        if (con == null){
            System.out.println("Connection Finished");
        }
    }
}

