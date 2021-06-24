public class StringExercise11 {
    int digitFromRight(String str, int position) {
        if (position >= str.length()) return 0;
        return str.charAt(str.length() - 1 - position) - '0';
    }

    public String minusStringNumber(String strNum1, String strNum2) {
        if ((strNum1.length() == strNum2.length() && strNum1.compareTo(strNum2) < 0) ||
                strNum1.length() < strNum2.length()) {
            return '-' + minusStringNumber(strNum2, strNum1);
        }

        StringBuilder result = new StringBuilder();
        int memory = 0;

        for (int i = 0; i < strNum1.length(); i++) {
            int minus = digitFromRight(strNum1, i) - digitFromRight(strNum2, i) - memory;

            if (minus < 0) {
                minus += 10;
                memory = 1;
            } else {
                memory = 0;
            }

            result.insert(0, minus);
        }

        return result.toString();
    }
}
