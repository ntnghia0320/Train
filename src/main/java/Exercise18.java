import java.util.HashMap;
import java.util.Map;

public class Exercise18 {
    private static final Map<Character,
                            Integer> roman = new HashMap<Character,
                                                        Integer>()
    {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String romanNumber) {
        int sum = 0;
        int n = romanNumber.length();

        for (int i = 0; i < n; i++) {
            if (i != n - 1 && roman.get(romanNumber.charAt(i)) <
                    roman.get(romanNumber.charAt(i + 1))) {
                sum += roman.get(romanNumber.charAt(i + 1)) -
                        roman.get(romanNumber.charAt(i));
                i++;
            } else {
                sum += roman.get(romanNumber.charAt(i));
            }
        }

        return sum;
    }
}
