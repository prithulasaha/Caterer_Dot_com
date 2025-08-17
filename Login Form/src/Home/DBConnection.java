/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

/**
 *
 * @author Lenovo
 */
import java.sql.*;
public class DBConnection {
    Connection conn=null;
    static final String DB_URL="jdbc:mysql//localhost/demo2";
    static final String USER="root";
     static final String PASS="";
     public static Connection connectDB(){
         Connection con=null;
         try{
             class.forName("com.mysql.jdbc.Driver");
             conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return  conn;
             
         }
         catch(Execption ex){
             System.out.println("There were errors while connecting to DB");
             return null;
         }
     }
}
    

