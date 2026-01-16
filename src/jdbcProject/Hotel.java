package jdbcProject;

import java.sql.*;
import java.util.Scanner;

/*
create table reservation(
reservation_id INT AUTO_INCREMENT PRIMARY KEY,
guest_name VARCHAR(255) NOT NULL,
room_number INT NOT NULL,
contact_number VARCHAR(10) NOT NULL,
reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
 */
public class Hotel {
    static void main() {
        String url = "jdbc:mysql://localhost:3306/hotel_db";
        String username = "root";
        String password = "2000@nitesh";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            while (true) {
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner sc = new Scanner(System.in);
                System.out.println("1 Reserv a room");
                System.out.println("2 View Reservation");
                System.out.println("3 Get Room Number");
                System.out.println("4 Update Reservation");
                System.out.println("5 Delete Reservation");
                System.out.println("0. Exit");
                System.out.println("Choose an opetion: ");
                int choise = sc.nextInt();
                switch (choise) {
                    case 1:
                        reserveRoom(con, sc);
                        break;
                    case 2:
                              viewReservations(con);
                        break;
                    case 3:
                        //    getRoomNumber(con,sc);
                        break;
                    case 4:
                        //  updateReservation(con,sc);
                        break;
                    case 5:
                        // deleteReservation(con,sc);
                        break;
                    case 0:
                        // exit();
                        sc.close();
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
/*        catch (InterruptedException e) {
            throw  new RuntimeException(e);
        } */
    }


    private static void reserveRoom(Connection con, Scanner sc) {
        try {
            System.out.println("Enter guest name: ");
            String guestName = sc.next();
            sc.nextLine();
            System.out.println("Enter Room number:");
            int roomNumber = sc.nextInt();
            System.out.println("Enter Contact number:");
            String contactNumber = sc.next();
            String sql = "insert into reservation(guest_name,room_number,contact_number) values('" + guestName + "' , " + roomNumber + " , '" + contactNumber + "')";

            try (Statement st = con.createStatement()) {
                int affectesRows = st.executeUpdate(sql);
                if (affectesRows > 0) {
                    System.out.println("Reservation Sucessfully");
                } else {
                    System.out.println("Reservation Failed");
                }
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

private static void viewReservations(Connection con) throws SQLException{
        String sql="select reservation_id,guest_name,room_number,reservation_date from reservation";
try(Statement st =con.createStatement();
    ResultSet res=st.executeQuery(sql)){
    System.out.println("Current Reservations:");
    System.out.println("+-----------------+---------------+--------------+------------------+---------------------+");
    System.out.println("| Reservations Id | Guest         | Room Number  | Contact Number   |  Reservationd Date  |");
    System.out.println("+-----------------+---------------+--------------+------------------+---------------------+");
    while(res.next()){
        int reservationId=res.getInt("reservation_id");
        String guestName=res.getString("guest_name");
        int roomNumber=res.getInt("room_number");
        String conNumber= res.getString("contact_number");

        String reservationDate=res.getTimestamp("reservation_date").toString();
        System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s |\n ", reservationId,guestName,roomNumber,conNumber,reservationDate);
    }
    }


}



}