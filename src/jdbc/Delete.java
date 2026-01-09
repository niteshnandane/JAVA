package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        String sql="delete from employees where id=3;";
        try{
           Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            int aff=st.executeUpdate(sql);
            if(aff>0){
                System.out.println("delete data");
            }
            else{
                System.out.println("failed");
            }
            st.close();
            con.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
