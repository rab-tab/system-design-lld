package LLDNotificationSystem;

public class EmailHandler implements NotificationSender {

    @Override
    public void sendNotification() {
        System.out.println("Sending email ...");
    }

}
