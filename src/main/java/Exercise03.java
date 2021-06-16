import java.util.ArrayList;

public class Exercise03 {
    public String phanTichThuaSoNguyenTo(int n) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result.add(String.valueOf(i));
                n /= i;
            }
        }

        return String.join(" * ", result);
    }
}
