public class StringExercise08 {
    public boolean checkBarcode(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += i % 2 == 0 ? str.charAt(i) - '0' : (str.charAt(i) - '0') * 3;
        }

        return sum % 10 == 0;
    }
}
