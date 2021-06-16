public class StringExercise06 {
    public String shortcutString(String str) {
        int n = str.length() - 1;
        int count = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else if (count > 1) {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            } else {
                result.append(str.charAt(i));
            }
        }

        if (count > 1) {
            result.append(str.charAt(n - 1));
            result.append(count);
        } else {
            result.append(str.charAt(n));
        }

        return String.valueOf(result);
    }
}
