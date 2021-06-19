public class StringExercise10 {
    public String subStringNumber(String strNum1, String strNum2) {
        if (strNum1.length() < strNum2.length()) {
            return subStringNumber(strNum2, strNum1);
        }

        int surplus = 0;
        int k = strNum1.length() - strNum2.length();
        StringBuilder result = new StringBuilder();

        for (int i = strNum1.length() - 1; i >= 0; i--) {
            int sum = i >= k ? strNum2.charAt(i - k) - '0' + strNum1.charAt(i) - '0' : strNum1.charAt(i) - '0';

            if (surplus > 0) {
                sum += surplus;
                surplus = 0;
            }

            if (sum > 9) {
                surplus = sum / 10;
                sum = sum % 10;
            }

            result.append(sum);
        }

        if (surplus > 0) {
            result.append(surplus);
        }

        return result.reverse().toString();
    }
}
