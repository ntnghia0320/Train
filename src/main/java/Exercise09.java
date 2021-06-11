public class Exercise09 {
    public static final double E = 0.00001;
    public static final double PI = 3.14159;

    public double calculatePi() {
        double e = 1.0;
        double sum = 0.0;
        int n = 2;

        while (e > E) {
            if (n % 4 == 0)
                sum -= 1.0 / (n * (n + 1) * (n + 2));
            else
                sum += 1.0 / (n * (n + 1) * (n + 2));

            e = Math.abs(3 + sum * 4 - PI);
            n += 2;
        }

        sum = 3.14159 + e;

        return sum;
    }
}