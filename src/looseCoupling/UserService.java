package looseCoupling;


public class UserService {
 public NotificationService notificationService;

    public UserService() {
    }

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send("Notification hello");
     //   System.out.println(message);




    }
}
