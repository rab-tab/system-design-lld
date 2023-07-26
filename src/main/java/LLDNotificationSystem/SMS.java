package LLDNotificationSystem;

public class SMS implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("SMS message");
    }
}
