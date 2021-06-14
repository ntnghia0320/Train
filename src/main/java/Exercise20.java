public class Exercise20 {

    private int convert(int n){
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public boolean happyNumber(int n) {
        while (n > 9) n = convert(n);
        return n == 1;
    }
}
