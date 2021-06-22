public class StringExercise11 {
    int digitFromRight(String str, int position) {
        if (position >= str.length()) return 0;
        return str.charAt(str.length() - 1 - position) - '0';
    }

    public int minusStringNumber(String strNum1, String strNum2) {
        int sign1 = 1;
        int sign2 = 1;
        int level = 1;
        int sum = 0;

        if (strNum1.charAt(0) == '-') {
            strNum1 = strNum1.substring(1);
            sign1 = -1;
        }

        if (strNum2.charAt(0) == '-') {
            strNum2 = strNum2.substring(1);
            sign2 = -1;
        }

        int limit = Math.max(strNum1.length(), strNum2.length());

        for (int i = 0; i < limit; i++) {
            sum += (sign1 * digitFromRight(strNum1, i) - sign2 * digitFromRight(strNum2, i)) * level;
            level *= 10;
        }

        return sum;
    }
}
