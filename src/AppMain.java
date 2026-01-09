import couplingDemo.UserService;
import looseCoupling.SMSNotificationService;
import looseCoupling.NotificationService;

public class AppMain {
    static void main() {
        //tight coumpling
      UserService us=new UserService();
      us.notifyUser("order placed");

      // loose coupling
        NotificationService SmsService=new SMSNotificationService();  // constructor Injection
        looseCoupling.UserService userService=new looseCoupling.UserService(SmsService);
        userService.notifyUser("order process");


        looseCoupling.UserService userServiceSetter=new looseCoupling.UserService(); //setter injection
        userServiceSetter.setNotificationService(SmsService);
        userServiceSetter.notificationService=SmsService;
    }
}
/*
Constructor Injection -dependency is provided via constructor
Setter Injection -dependency is provided via setter method
Field Injection -dependency is assigned directly to a filed
 */