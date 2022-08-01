import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> letters = Pattern.compile(""). splitAsStream("word").collect(Collectors.toList());
        List<Character> chars = "word".chars()
                .mapToObj(it -> (char) it)
                .collect(Collectors.toList());
        letters.forEach(System.out::println);
        chars.forEach(System.out::println);
    }
}
