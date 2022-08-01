import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracesMatcher {
    public static Map<Character, Character> braces = new HashMap<>();
    static {
        braces.put('[', ']');
        braces.put('{', '}');
        braces.put('(', ')');
    }
    public boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (char sign: exp.toCharArray()) {
            if (braces.containsKey(sign)) {
                stack.push(sign);
            }
            else if (braces.containsValue(sign)) {
                if (stack.isEmpty() || !braceMatches(sign, stack)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private boolean braceMatches(char brace, Stack stack) {
        return braces.get(stack.peek()).equals(brace);
    }
}
