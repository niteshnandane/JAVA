package jdbc;

import java.sql.*;

/*
create table employees2(id int primary key AUTO_INCREMENT,name varchar(255),job_title varchar(255),salary double);
 */
public class BatchProcessing {
    static void main() {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="2000@nitesh";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers load");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            // PreparedStatement ps= con.prepareStatement(sql);
            con.setAutoCommit(false);
            Statement st=con.createStatement();
            st.addBatch("insert into employees2(name,job_title,salary) values('vashu','hr manager',65000.0)");
            st.addBatch("insert into employees2(name,job_title,salary) values('karan','cyber security analyst',55000.0)");
            st.addBatch("insert into employees2(name,job_title,salary) values('vishal','DevOps Engineer',45000.0)");
            int[] batchResult= st.executeBatch();
            con.commit();
            System.out.println("Batch Execute Successfully");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
