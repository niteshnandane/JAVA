package couplingDemo;

public class UserService {
    NotificationService n=new NotificationService();
    public void notifyUser(String message){
        n.send("Notification  hello");
     //   System.out.println(message);
    }
}
