public class Exercise01 {
    public int gcd(int n, int m){
        int tmp = 0;

        if(n < m) {
            n = m + n;
            m = n - m;
            n = n - m;
        }
        while(m != 0) {
            tmp = n%m;
            n = m;
            m = tmp;
        }

        return n;
    }

    public int lcm(int n, int m){
        return n*m/gcd(n, m);
    }
}