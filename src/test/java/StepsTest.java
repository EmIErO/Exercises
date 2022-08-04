import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

class StepsTest {
    private final Steps steps = new Steps();

    @Test
    void shouldFindAllPossibleSteps() {
        // given
        long numberOfSteps = 5;
        long[] allowed = {1,2,3,4,5}; // -> 1111 22 112 121 211

        // when
        steps.findAllStepsCombinationsFor(numberOfSteps, allowed);

        // then
        //assertEquals(steps.getAllStepsCombination(), 5);
        steps.getAllSpecificStepCombination().forEach(
                it -> System.out.println(it.stream().map(String::valueOf).collect(Collectors.joining(", "))));
    }
}