public class StringExercise04 {
    static void computeLPSArray(String str, int M, int[] lps) {
        int len = 0;
        int i;

        lps[0] = 0;
        i = 1;

        while (i < M) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public boolean isRepeatString(String str) {
        int n = str.length();
        int[] lps = new int[n];

        computeLPSArray(str, n, lps);

        int len = lps[n - 1];

        return len > 0 && n % (n - len) == 0;
    }
}