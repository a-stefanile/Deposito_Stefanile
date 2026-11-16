public class VeicoloFactory {
    public static Veicolo create(String type){
        return switch (type){
            case "car" -> new Auto();
            case "motorcycle"-> new Moto();
            default -> throw new IllegalArgumentException("The type is fobidden");
        };
    }
}
