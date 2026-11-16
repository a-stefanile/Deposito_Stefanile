public class ReverseString implements Format{
    @Override
    public String apply(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        return sb.reverse().toString();
    }
}
