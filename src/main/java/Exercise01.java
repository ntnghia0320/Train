public class Exercise01 {
    public int gcd(int n, int m) {

        if (n < m) return gcd(m, n);
        while (m != 0) {
            int tmp = 0;
            tmp = n % m;
            n = m;
            m = tmp;
        }

        return n;
    }

    public int lcm(int n, int m){
        return n * m / gcd(n, m);
    }
}