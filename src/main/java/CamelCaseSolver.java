import java.util.stream.Collector;
import java.util.stream.IntStream;

public class CamelCaseSolver {

    public String camelCase(String input) {
        return input.chars()
                .flatMap(this::convert)
                .mapToObj(it -> (char) it)
                .collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString));
    }

    public String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1"); //The replacement string $1 means "group 1" (the first group made by a set of brackets).
    }

    public String regexWithGroups(String input) {
        return input.replaceAll("(\\w+)(\\d)", " $2"); //The replacement string $1 means "group 1" (the first group made by a set of brackets).
    }

    private IntStream convert(int character) {
        return (isCapitalLetter(character)) ? IntStream.of(32, character) : IntStream.of(character);
    }

    private boolean isCapitalLetter(int character) {
        return character >= 65 && character <= 90;
    }
}
