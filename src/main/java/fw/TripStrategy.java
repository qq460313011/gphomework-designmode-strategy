package fw;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 17:46
 * @Description:
 */
public class TripStrategy {

    private Trip trip;

    public TripStrategy(Trip trip) {
        this.trip = trip;
    }

    public void GoTrip(int needTime) {
        trip.Go(needTime);
    }
}
