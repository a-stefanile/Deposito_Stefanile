public class MainMiddle{
    public static void main(String[] args) {
        Distributore.INSTANCE.insert(5.0);
        System.out.println("Credit after the insert: "+ Distributore.INSTANCE.getCredit());

        boolean result1 = Distributore.INSTANCE.erogation(2.0);
        System.out.println("result1: "+result1);
        System.out.println("new credit is: "+Distributore.INSTANCE.getCredit());

        boolean result2 = Distributore.INSTANCE.erogation(6.0);
        System.out.println("result2: "+result2);
        System.out.println("new credit is: "+Distributore.INSTANCE.getCredit());
    }
}