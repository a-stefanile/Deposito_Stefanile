import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CommandFactory {
    private static final Map<String, Supplier<Command>> FABBRICHE = Map.of(
            "sum", Sum::new,
            "multiply", Multiply::new
    );

    public static Optional<Command> create(String command) {
        Supplier<Command> factory = FABBRICHE.get(command);
        if (factory == null) {
            return Optional.empty();
        }
        return Optional.of(factory.get());
    }
}
