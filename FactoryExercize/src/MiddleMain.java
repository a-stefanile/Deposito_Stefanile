import java.util.Optional;

public class MiddleMain {
    public static void main(String[] args) {
        Optional<Command> commandSum = CommandFactory.create("sum");
        commandSum.ifPresent(command -> System.out.println("The result of 3+4 is: " + command.execute(3,4)));

        Optional<Command> commandMultiply = CommandFactory.create("multiply");
        commandMultiply.ifPresent(command -> System.out.println("The result of 3*4 is: " + command.execute(3,4)));

        Optional<Command> commandDivide = CommandFactory.create("divide");
        if(commandDivide.isEmpty()) {
            System.out.println("Uknown command you'll get an empty optional");
        }
    }
}
