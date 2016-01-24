/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class KlientBazy {
    private String host;
    private String userName;
    private String userPassword;
    Connection con;
    
    public KlientBazy(){
        host = "jdbc:derby://localhost:1527/Obiektyw";
        userName = "user1";
        userPassword = "password";
        try {
            con = DriverManager.getConnection( host, userName, userPassword);
        }
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
    
    public void zakoncz(){
        try{
            if(con != null) con.close();
        }catch ( SQLException err ){
             System.out.println( err.getMessage( ) );
        }
        
    }
    public void printTest(){
        Statement stm = null;
        ResultSet rs = null;
        
        try{
            stm = con.createStatement();
            String SQL = "SELECT * FROM OBIEKTYWY";
            rs = stm.executeQuery(SQL);
            
            while(rs.next()){
                int id_col = rs.getInt("ID");
                String nazwa = rs.getString("NAZWA");
                System.out.println(id_col + " " + nazwa);
            }
            rs.close();
            
        } catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }finally{
            try{
               if(stm != null) stm.close();
            }catch(SQLException err){
                System.out.println( err.getMessage( ) );
            }
        }
        
        
    }
}
