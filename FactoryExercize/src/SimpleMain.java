public class SimpleMain {
    public static void main(String[] args) {
        Veicolo car = VeicoloFactory.create("car");
        Veicolo motorcycle = VeicoloFactory.create("motorcycle");

        System.out.println("Car tires: " + car.tires());
        System.out.println("Motorcycle tires: " + motorcycle.tires());
    }
}
