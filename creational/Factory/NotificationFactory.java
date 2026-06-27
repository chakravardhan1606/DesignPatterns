class NotificationFactory{
    
   
    public static Notification getNotificationObject(NotificationType type){
        
        switch (type){
            case  SMS :
                return new SMSNotification();
               
            case  EMAIL :
                return new EmailNotification();
                
            case  PUSH :
                return new PushNotification();
               
        default :
            return new PushNotification();
        }   
    }
    
    
}
