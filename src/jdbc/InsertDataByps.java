package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//create table employees(id int(10),name varchar(255),job_title varchar(255),salary double);

public class InsertDataByps {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";
        String sql="insert into employees(id,name,job_title,salary)values(?,?,?,?);";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement ps=con.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            System.out.println("enter id:");
            int id=sc.nextInt();
            System.out.println("Enter Name:");
            String name=sc.next();
            sc.nextLine();
            System.out.println("Enter job Name");
            String job= sc.nextLine();
            System.out.println("enter salary");
            double salary=sc.nextDouble();
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,job);
            ps.setDouble(4,salary);
            int af=ps.executeUpdate();
            if(af>0){
                System.out.println("insert data");
            }else{
                System.out.println("failed");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
