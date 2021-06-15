public class Exercise09 {
    public static final double E = 0.00001;

    public double calculatePi() {
        double e = 1.0;
        double sum = 3.0;
        int n = 2;

        while (e > E) {
            e = 4.0 / (n * (n + 1) * (n + 2));
            sum += n % 4 == 0 ? -e : e;

            n += 2;
        }

        return sum;
    }
}