package fw;

/**
 * @Auther: Administrator
 * @Date: 2019/4/3 17:49
 * @Description:
 */
public class StrategyTest {

    public static void main(String[] args) {

        TripStrategy strategy=new TripStrategy(new Train());

        strategy.GoTrip(3);

    }

}
