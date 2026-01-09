package jdbc;

import java.io.*;
import java.sql.*;

/*
create table image_table(
image_id INT AUTO_INCREMENT PRIMARY KEY,
image_data LONGBLOB NOT NULL,
upload_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
 */
public class ImageInsert {
    static void main() {
        String url="jdbc:mysql://localhost:3306/image";
        String username="root";
        String password="2000@nitesh";
   /*     String image_path="C:\\Users\\DELL\\Downloads\\r.jpg";
        String query="insert into image_table(image_data) values(?);";
    */
        String  folder_path="C:\\Users\\DELL\\Downloads\\retriveimage";
        String query="select image_data from image_table where image_id=(?)";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
         Connection con= DriverManager.getConnection(url,username,password);
   /*            FileInputStream fileInputStream=new FileInputStream(image_path);
            byte[] imageData=new byte[fileInputStream.available()];
            fileInputStream.read(imageData);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setBytes(1,imageData);
            int af=ps.executeUpdate();
            if(af>0){
                System.out.println("image insert successfully");
            }else{
                System.out.println("failed");
           } */
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1,1);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
             byte[] image_data=rs.getBytes("image_data");
             String image_path=folder_path+"ectractImage.jpg";
                OutputStream outputStream=new FileOutputStream(image_path);
                outputStream.write(image_data );
            }else{
                System.out.println("Image not found");
            }
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
