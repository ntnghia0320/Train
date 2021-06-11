public class Exercise08 {
    public static final double E = 0.0001;
    public static final double PI = 3.1415;

    public double calculatePi() {
        double e = 1.0;
        double sum = 0.0;
        int n = 0;

        while (e > E) {
            if (n % 2 == 0)
                sum += 1.0 / (2 * n + 1);
            else
                sum -= 1.0 / (2 * n + 1);

            e = Math.abs(sum * 4 - PI);

            n++;
        }

        sum *= 4;

        return sum;
    }
}
