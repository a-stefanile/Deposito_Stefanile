public class Multiply implements Command{
    @Override
    public String execute(int op1, int op2) {
        return String.valueOf(op1 * op2);
    }
}
