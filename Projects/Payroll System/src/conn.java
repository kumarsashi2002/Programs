/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */

import java.sql.*;

public class conn {    
public Connection conn;
public Statement s;
public PreparedStatement pstmt;
public conn(){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
String connectionurl="jdbc:mysql://localhost:3306/pocketmuster?
user=root&password=9029059791";
conn=DriverManager.getConnection(connectionurl);
System.out.println("Connected");
s = conn.createStatement();
}
catch(Exception e) {
e.printStackTrace();
}
}    
}
