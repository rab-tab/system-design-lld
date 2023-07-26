package LLDNotificationSystem;

public class QRMessage extends Notification {

    public QRMessage() {
    }

    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is  QRMessage...");
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }

}
