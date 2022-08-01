public class SquareNumCalculator {

    public long solve(int n){
        long searched = Long.MAX_VALUE;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                int a = i;
                int b = n / i;
                if (b - a != 0 && (b - a) % 2 == 0) {
                    searched = Math.min(searched, (b - a) / 2);
                }
            }
        }
        return Long.MAX_VALUE == searched ? -1 : searched * searched;
    }
}
