import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Dictionary {

    public Map<String, List<String>> from(List<String> words) {
        return words.stream()
                .filter(Objects::nonNull)
                .filter(it -> !it.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(it -> it.substring(0,1)));
    }
}
