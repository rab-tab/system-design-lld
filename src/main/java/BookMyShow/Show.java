package BookMyShow;

import java.util.Date;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaHall;

    List<Seat> seats;
}
