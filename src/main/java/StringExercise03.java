public class StringExercise03 {
    public int findSumNumber(String str) {
        int temp = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp = temp * 10 + (str.charAt(i) - '0');
            } else {
                sum += temp;
                temp = 0;
            }
        }

        return sum + temp;
    }
}