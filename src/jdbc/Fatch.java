package jdbc;
import java.sql.*;
public class Fatch {
    static void main() {

        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        String query="select *from employees";
     try{
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded Sucessfulyy");
     } catch (ClassNotFoundException e) {
         System.out.println(e.getMessage());
     }
     try {
         Connection con=DriverManager.getConnection(url,username,password);
         Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        while(rs.next()){
           int id=rs.getInt("id");
           String name=rs.getString("name");
           String job_title=rs.getString("job_title");
           Double salary=rs.getDouble("salary");
            System.out.println("ID:"+id);
            System.out.println("NAME:"+name);
            System.out.println("Job_title:"+job_title);
            System.out.println("SALARY:"+salary);
            System.out.println("........................................................................");
        }
        rs.close();
        st.close();
        con.close();

         System.out.println("connection close");
     }
     catch (SQLException e){
         System.out.println(e.getMessage());
     }
    }
}
