public class Exercise08 {
    public static final double E = 0.0001;

    public double calculatePi() {
        double e = 1.0;
        double sum = 0.0;
        int n = 0;

        while (e > E) {
            e = 4.0 / (2 * n + 1);
            sum += n % 2 == 0 ? e : -e;

            n++;
        }

        return sum;
    }
}
