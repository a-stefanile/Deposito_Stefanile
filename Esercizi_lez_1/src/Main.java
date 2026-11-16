import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
   /*
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Testing for construct\n");
        //testFor(scanner);
        //System.out.println("\nTesting swtich construct\n");
        //testSwitch(scanner);
        //System.out.println("\nTesting while construct\n");
        //testWhile(scanner);
        System.out.println("\nTesting do while construct\n");
        testDoWhile(scanner);
    }
    //for construct
    public static void testFor(Scanner scanner){
        for(int i=1;i<=20;i++){
            if(isEven(i))
                System.out.println(i);
        }
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void testWhile(Scanner scanner){
        System.out.println("Insert a value ");
        int value = scanner.nextInt();
        while(value>0){
            System.out.println(value);
            value--;
        }

    }

    public static void testDoWhile(Scanner scanner){
        int value =0, n=0;
        do{
            System.out.println("Insert: \n1 to insert a valure; \n2 to see the value; \n0 to exit");
            value = scanner.nextInt();

            switch(value){
                case 1:
                    System.out.println("Insert a value ");
                    n = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("See last inserted value is : "+n);
                    break;
                case 0:
                    break;
            }
        }while(value!=0);
    }

    public static void testSwitch(Scanner scanner){
        System.out.println("Insert a value for the month (1-12)\n");
        int month = scanner.nextInt();
        switch(month){
            case 1:
                System.out.println("Month 1: January");
                break;
            case 2:
                System.out.println("Month 2: February");
                break;
            case 3:
                System.out.println("Month 3: March");
                break;
            case 4:
                System.out.println("Month 4: April");
                break;
            case 5:
                System.out.println("Month 5: May");
                break;
            case 6:
                System.out.println("Month 6: June ");
                break;
            case 7:
                System.out.println("Month 7: July ");
                break;
            case 8:
                System.out.println("Month 8: August");
                break;
            case 9:
                System.out.println("Month 9: September");
                break;
            case 10:
                System.out.println("Month 10: October ");
                break;
            case 11:
                System.out.println("Month 11: November ");
                break;
            case 12:
                System.out.println("Month 12: December");
                break;

                default:
                    System.out.println("Invalid month");
        }

    */
        Auto auto1 = new Auto("fiat", "panda");

        auto1.mostraDettagli();
        auto1.muovi();
        auto1.avviaMotore();

    }

}