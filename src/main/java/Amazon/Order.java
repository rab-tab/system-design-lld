package Amazon;

import java.util.Date;
import java.util.List;

public class Order {

    int orderId;
    Date orderDate;
    List<Item> items;
    double orderValue;
    NotificationService notificationService;

    public void placeOrder(){};
    public void trackOrder(){};
    public PaymentStatus makePayment(PaymentType paymentType){return PaymentStatus.SUCCESS;}


}
