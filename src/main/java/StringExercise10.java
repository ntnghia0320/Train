public class StringExercise10 {
    private int digitFromRight(String str, int position) {
        if (position >= str.length()) return 0;
        return str.charAt(str.length() - 1 - position) - '0';
    }

    public String subStringNumber(String strNum1, String strNum2) {
        int memory = 0;
        StringBuilder result = new StringBuilder();

        int maxLength = Math.max(strNum1.length(), strNum2.length());

        for (int i = 0; i < maxLength; i++) {
            int sum = digitFromRight(strNum1, i) + digitFromRight(strNum2, i);
            sum += memory;
            memory = sum / 10;
            result.insert(0, sum % 10);
        }

        if (memory > 0) result.insert(0, memory);

        return result.toString();
    }
}
