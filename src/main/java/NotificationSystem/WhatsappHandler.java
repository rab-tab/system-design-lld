package NotificationSystem;

public class WhatsappHandler implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending whatsapp mesasge ...");
    }
}
