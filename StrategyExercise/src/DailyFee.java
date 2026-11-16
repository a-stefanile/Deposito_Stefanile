public class DailyFee implements ParkingFee{
    @Override
    public double calculateFee(int hours) {
        return 10.0;
    }
}
