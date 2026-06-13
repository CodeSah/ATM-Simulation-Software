package mero.khata;

import java.sql.*;
public class connection {
    Connection c;
    Statement s;
     public connection(){
         try{
            
             c=DriverManager.getConnection("jdbc:mysql:///merokhata","root","khushi@2003");
             s=c.createStatement();
             
         }catch(Exception e){
             System.out.println(e);
         }
     }
}
