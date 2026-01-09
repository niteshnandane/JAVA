package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
create table accounts(
account_number VARCHAR(20) PRIMARY KEY,
balance DECIMAL(10,2)
);

insert into accounts(account_number,balance)values
('acc123',1000.00),
('acc456',500.00),
('acc789',750.00);
 */
public class TransactionHandling {
    static void main() {
        String url="jdbc:mysql://localhost:3306/transactions";
        String username="root";
        String password="2000@nitesh";
        String withdraw="update accounts set balance=balance-? where account_number=?";
        String deposite="update accounts set balance=balance+? where account_number=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connect");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            con.setAutoCommit(false);
            try {
                PreparedStatement w = con.prepareStatement(withdraw);
                PreparedStatement d = con.prepareStatement(deposite);
                w.setDouble(1, 500.00);
                w.setString(2, "acc123");
                d.setDouble(1, 500);
                d.setString(2, "acc456");
                int af1=w.executeUpdate();
                int af2=d.executeUpdate();
                if(af1>0 && af2>0) {
                    con.commit();
                    System.out.println("Transaction sucessfully");
                }else {
                    con.rollback();
                    System.out.println("transaction failed");
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
