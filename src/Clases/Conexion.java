/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Jojhan
 */
public class Conexion {
    //realizar conexion entre java y BD 
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=super;"
                + "user=sa;"
                +"password=bebesito;";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
            
        }catch(SQLException e){
            System.out.println(e.toString());
           return null;
        }
        
    }
    
}
