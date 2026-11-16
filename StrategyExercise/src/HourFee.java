public class HourFee implements ParkingFee{
    @Override
    public double calculateFee(int hours) {
        return hours*2;
    }
}
