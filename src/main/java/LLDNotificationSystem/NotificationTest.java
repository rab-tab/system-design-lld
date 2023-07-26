package LLDNotificationSystem;

public class NotificationTest {
    public static void main(String[] args) {
        TextMessage textMessage=new TextMessage(new EmailHandler());
        textMessage.sendMessage();

        TextMessage smsMessage=new TextMessage(new SMS());
        smsMessage.sendMessage();
    }
}
