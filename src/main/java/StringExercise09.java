public class StringExercise09 {
    public int createBarcode(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += i % 2 == 0 ? str.charAt(i) - '0' : (str.charAt(i) - '0') * 3;
        }

        return 10 - sum % 10;
    }
}
