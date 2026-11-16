public class EasyMain {
    public static void main(String[] args) {

        int parkingHours = 5;

        ParkingFee fee1 = new HourFee();
        ParkingFee fee2 = new DailyFee();

        System.out.println("Hour fee price : " +fee1.calculateFee(parkingHours) );
        System.out.println("Daily fee price: "+ fee2.calculateFee(parkingHours));
    }
}
