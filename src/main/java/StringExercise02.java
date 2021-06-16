public class StringExercise02 {
    public boolean isSymmetry(String str) {
        int n = str.length();

        for (int i = 0; i <= n / 2; i++) {
            if (str.codePointAt(i) - str.codePointAt(n - 1 - i) != 0) {
                return false;
            }
        }

        return true;
    }
}
