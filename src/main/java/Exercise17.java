public class Exercise17 {
    public double calculateSqrt(int n) {
        final double E = 0.001;
        double numSqrt = 1.0;

        while (Math.abs(numSqrt * numSqrt - n) > E)
            numSqrt = (n / numSqrt - numSqrt) / 2 + numSqrt;

        return numSqrt;
    }
}