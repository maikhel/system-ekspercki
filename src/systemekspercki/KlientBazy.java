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
    
    public void znajdzObiektyw(String sql){
        Statement stm = null;
        ResultSet rs = null;
        
        try{
            stm = con.createStatement();
            //System.out.println(sql);
            rs = stm.executeQuery(sql);
            
            System.out.println("--------");
            System.out.println("WYNIK:");
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
    public void printTest(){
        Statement stm = null;
        ResultSet rs = null;
        
        try{
            stm = con.createStatement();
            String inni = "OR PRODUCENT = 'Tamron' OR PRODUCENT = 'Sigma' OR PRODUCENT = 'Samyang'";
            String producent ="(" + "PRODUCENT = " + "'Pentax'" + inni + ")";
            String ogniskowaString = " AND DOLNA_OGNISKOWA != GORNA_OGNISKOWA ";
                String zakresOgniskowejString = "AND (DOLNA_OGNISKOWA > 200 OR GORNA_OGNISKOWA > 200)";
            String czyFishEyeString = " AND FISHEYE = 0";
            
            	String zakresCenyString = " AND (CENA >= 500 AND CENA < 1000)";
            
            String SQL = "SELECT * FROM OBIEKTYWY WHERE " + 
                    producent + ogniskowaString +
                    zakresOgniskowejString
                    + czyFishEyeString
                    + zakresCenyString; //"WHERE PRODUCENT = 'Pentax' AND DOLNA_OGNISKOWA > 35 AND GORNA_OGNISKOWA < 70";
            System.out.println(SQL);
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
