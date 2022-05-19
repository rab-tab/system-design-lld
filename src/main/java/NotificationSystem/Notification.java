package NotificationSystem;

public abstract class Notification {

    NotificationSender notificationSender;

    public Notification() {
    }

    public Notification(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    abstract void sendMessage();
}
