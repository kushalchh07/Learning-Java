
import java.sql.*;
class Jdbcdemo{

public static void main(String args[]){


String   connString = "jdbc:mysql://localhost:3306/empdb";  
String   user = "root";  
String   pass = "pranita";  

try{
    Connection conn = DriverManager.getConnection(connString,user,pass);
    Statement stmt = conn.createStatement();

    ResultSet rs = stmt.executeQuery("select * from employee");
    while(rs.next()){
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
    }
}catch(Exception e){
    System.out.println(e);}
}
}