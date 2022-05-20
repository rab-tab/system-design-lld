package BookMyShow;


import java.util.Date;
import java.util.List;

public class Booking {

    String bookingId;
    Date bookingDate;
    Show show;
    Auditorium auditorium;
    BookingStatus bookingStatus;
    List<Seat> seats;
    Payment paymentObj;



}
