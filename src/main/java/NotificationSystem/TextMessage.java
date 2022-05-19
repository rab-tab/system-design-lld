package NotificationSystem;

public class TextMessage extends Notification{
    public TextMessage() {
    }

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is  TextMessage...");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
