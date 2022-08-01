import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BracesMatcherTest {

    private BracesMatcher matcher = new BracesMatcher();

    @Test
    public void matches() {
        List<String> good = Arrays.asList("", "{}","[]{}", "{[()]}", "asd{bh[g]}ff");
        good.stream().forEach(
                it -> {
                    System.out.println("Phrase: " + it + " " + matcher.isBalanced(it));
                    assertEquals(matcher.isBalanced(it), true);
                }
        );
    }

    @Test
    public void doesNotMatch() {
        List<String> good = Arrays.asList("{","[]{}(", ")", "(((", "asd{bh[g]})ff");
        good.stream().forEach(
                it -> {
                    System.out.println("Phrase: " + it + " " + matcher.isBalanced(it));
                    assertEquals(matcher.isBalanced(it), false);
                }
        );
    }
}