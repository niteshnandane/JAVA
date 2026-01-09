package jdbc;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class BatchProccesssing2 {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            con.setAutoCommit(false);
            String query="insert into employees2(name,job_title,salary) values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.println("enter name:");
                String name = sc.nextLine();

                System.out.println("enter job Name:");
                String job = sc.nextLine();

                System.out.println("Salary:");
                double salary = sc.nextDouble();

                ps.setString(1, name);
                ps.setString(2, job);
                ps.setDouble(3, salary);


                ps.addBatch();
                System.out.println(" add more values Y/N");
                String decision = sc.next();
                if (decision.toUpperCase().equals("N")) {
                    break;
                }
            }
                int[] batchResult=ps.executeBatch();
                con.commit();
                System.out.println("batch execute Successfully");


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
