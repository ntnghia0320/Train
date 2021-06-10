public class Exercise02 {
    public int tongCacChuSo(int n){
        return n > 0 ? tongCacChuSo(n / 10) + n % 10: 0;
    }
}