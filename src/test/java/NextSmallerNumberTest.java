import org.junit.jupiter.api.Test;

public class NextSmallerNumberTest {
    private final NextSmallerNumber smallerNumber = new NextSmallerNumber();

    @Test
    public void shouldFindNextSmallerNumber() {
        long number = 22138;

        long outcome = smallerNumber.nextSmaller(number);

        System.out.println(outcome);
    }

}