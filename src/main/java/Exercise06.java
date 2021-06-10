public class Exercise06 {
    public int tongDaySo(int n){
        return n > 0 ? tongDaySo(n - 1) + n * (n + 1) : 0;
    }
}
