public class Exercise03 {
    public StringBuilder phanTichThuaSoNguyenTo(int n) {
        StringBuilder result = new StringBuilder();

        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                result.append(i + " * ");
                n /= i;
            }
        }

        result.setLength( result.length() - 3 );

        return result;
    }
}
