import java.util.Arrays;

public class BumpingCar {
    public String bumps(final String road) {

        return Arrays.stream(road.split(""))
                .filter(letter -> letter.equals("n"))
                .count() > 15 ? "Cardead" : "Whooo!";
    }
}
