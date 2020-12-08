/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DAO {

    

    public static Connection getConnection() {
         Connection conn=null;
        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url="jdbc:sqlserver://localhost:1433;databasename=QLNoiThat";   
            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/qlnoithat";
            String user="root";
            String password="";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn; 
        
    }
    public static void main(String[] args) {
        Connection conn=DAO.getConnection();
        if(conn!=null){
            System.out.println("ket noi thanh cong");
        }
        else{
            System.out.println("ket noi that bai");
        }
    }
   
   
}
