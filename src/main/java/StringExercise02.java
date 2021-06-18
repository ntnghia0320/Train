public class StringExercise02 {
    public boolean isSymmetry(String str) {
        int n = str.length();

        for (int i = 0; i <= str.length() - i; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
