package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        String sql="update  employees set name='bhavini' where id=1;";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("e.getMassage()");
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            int af=st.executeUpdate(sql);
            if(af>0){
                System.out.println("update");
            }else {
                System.out.println("falied");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
