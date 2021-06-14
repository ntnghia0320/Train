
public class Exercise15 {
    public int reverseBit(int n) {
        int x = 0;
        do {
            x = (x << 1) | (n & 1);
        } while ((n >>= 1) > 0);

        return x;
    }
}
