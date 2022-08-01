import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Steps {
    private final List<List<Long>> listOfSteps = new ArrayList();
    private long combinations = 0;
    private long[] allowedSteps;

    public void findAllStepsCombinationsFor(long stepsLeft, long[] allowedSteps) {
        if (allowedSteps.length == 0) throw new IllegalArgumentException("Allowed steps array cannot be empty");
        // validate for not having steps equal 0 or lower
        this.allowedSteps = allowedSteps;
        findAllStepsCombinations(stepsLeft, new ArrayList<Long>());

    }

    public void findAllStepsCombinationsFor(long stepsLeft) {
        long[] allowedStepsArray = {1, 2};
        findAllStepsCombinationsFor(stepsLeft, allowedStepsArray);
    }

    public List<List<Long>> getAllSpecificStepCombination() {
        return this.listOfSteps;
    }
    public long getAllStepsCombination() {
        return combinations;
    }

    private void findAllStepsCombinations(long stepsNumber, List<Long> combination) {
        for (long step : this.allowedSteps) {
            List<Long> currentCombination = combination.stream().collect(Collectors.toList());
            long leftSteps = stepsNumber - step;
            if (leftSteps > 0) {
                currentCombination.add(step);
                findAllStepsCombinations(leftSteps, currentCombination);
            }
            if (leftSteps == 0) {
                currentCombination.add(step);
                listOfSteps.add(currentCombination);
                combinations++;
                return;
            }
            if (leftSteps < 0) return;
        }
    }

}
