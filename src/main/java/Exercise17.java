public class Exercise17 {
    public static final double E = 0.001;

    public double calculateSqrt(int n) {
        double numSqrt = 1.0;

        while (Math.abs(numSqrt * numSqrt - n) > E)
            numSqrt = (n / numSqrt - numSqrt) / 2 + numSqrt;

        return numSqrt;
    }
}