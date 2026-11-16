public class MainEasy{
    public static void main(String[] args) {
        Termostato term1 = Termostato.getInstance();
        Termostato term2 = Termostato.getInstance();

        System.out.println("are term1 and term2 the same obj? : "+ (term1==term2));

        term1.setTemp(25.121);

        System.out.println("temperature seen from term2: " + term2.getTemp());
    }
}