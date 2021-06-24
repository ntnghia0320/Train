public class StringExercise06 {
    public String shortcutString(String str) {
        str+=' ';
        int count = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                if (count > 1) {
                    result.append(count);
                    count = 1;
                }
            }
        }

        return result.toString();
    }
}
