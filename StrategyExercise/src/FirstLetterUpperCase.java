import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstLetterUpperCase implements Format{
    @Override
    public String apply(String text) {
        return Arrays.stream(text.split(" "))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .collect(Collectors.joining(" "));
    }

}
