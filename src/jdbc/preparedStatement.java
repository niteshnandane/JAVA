package jdbc;

import java.sql.*;

public class preparedStatement {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
      //  String query="select *from employees where name=?";
        String query="select *from employees;";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement ps= con.prepareStatement(query);
    //       ps.setString(1,"nitesh");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String job=rs.getString("job_title");
                Double salary=rs.getDouble("salary");
                System.out.println("Id:"+id);
                System.out.println("Name:"+name);
                System.out.println("Job:"+job);
                System.out.println("Salary:"+salary);
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            rs.close();
            ps.close();
            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
