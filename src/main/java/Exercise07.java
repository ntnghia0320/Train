public class Exercise07 {
    public int tinhGiaiThua(int n){
        return n > 1 ? tinhGiaiThua(n - 1) * n : 1;
    }
}
