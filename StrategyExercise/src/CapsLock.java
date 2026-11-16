import java.util.Locale;

public class CapsLock implements Format{
    @Override
    public String apply(String text) {
        return text.toUpperCase();
    }
}
