public class StringExercise11 {
    public String minusStringNumber(String strNum1, String strNum2) {
        int surplus = 0;
        int k = strNum1.length() - strNum2.length();
        StringBuilder result = new StringBuilder();

        for (int i = strNum1.length() - 1; i >= 0; i--) {
            int sum;
            if (k < 0) {
                sum = i >= -k ? (strNum1.charAt(i + k) - '0') - (strNum2.charAt(i+k) - '0') : -(strNum2.charAt(i) - '0');
            } else {
                sum = i >= k ? (strNum1.charAt(i) - '0') - (strNum2.charAt(i-k) - '0') : strNum1.charAt(i) - '0';
            }

            if (surplus < 0) {
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
