public class StringExercise03 {
    public int findSumNumber(String str) {
        int temp = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp = temp * 10 + Character.getNumericValue(ch);
            } else {
                sum += temp;
                temp = 0;
            }
        }

        return sum + temp;
    }
}
