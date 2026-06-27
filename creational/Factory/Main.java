// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
          NotificationAtributes attributes = new NotificationAtributes("chakri", "vamshi","Hi there","Push");
        
        
        // Without Using factory..
     

    Notification   notification = new PushNotification(); // u should now initialization of the class and its internals
       notification.send(attributes);
        
        
    // With Using factory 
        
    Notification emailNotification = NotificationFactory.getNotificationObject(NotificationType.EMAIL); // it abstracts the class initialization
    
        emailNotification.send(attributes);
    
    }
}
