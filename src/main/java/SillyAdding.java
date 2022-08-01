import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SillyAdding {

    public int add(int num1,int num2){
        String[] first = String.valueOf(num1).split("");
        String[] second = String.valueOf(num2).split("");

        String[] biggest = first.length >= second.length ? first : second;
        String[] smallest = biggest == first ? second : first;
        String[] outcome = new String[biggest.length];

        for (int i = 0; i < biggest.length; i++) {
            if (smallest.length == biggest.length) {
                Integer result = Integer.parseInt(biggest[i]) + Integer.parseInt(smallest[i]);
                outcome[i] = result.toString();
            }
            else if (i < biggest.length - smallest.length) {
                outcome[i] = biggest[i];
            }
            else {
                Integer result = Integer.parseInt(biggest[i]) + Integer.parseInt(smallest[i - biggest.length + smallest.length]);
                outcome[i] = result.toString();
            }
        }
        String value = Arrays.stream(outcome).collect(Collectors.joining());
        return Integer.parseInt(value);
    }

    public int sillyAddingRecurency(int num1, int num2) {
        return num1 + num2 == 0 ? 0 : Integer.parseInt(add(num1 / 10, num2 / 10) + "" + (num1 % 10 + num2 % 10));
    }
}
