package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        String sql="insert into employees(id ,name,job_title,salary)value(3,'sumit','data Egg',50000.0);";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
           int affected= st.executeUpdate(sql);
           if(affected>0){
               System.out.println("data insert");
           }
           else{
               System.out.println("failed");
           }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
