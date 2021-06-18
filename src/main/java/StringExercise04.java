public class StringExercise04 {
    public boolean isRepeatString(String str) {
        int[] lps = new int[str.length()];
        int repeatLength = 0;
        int i = 1;
        lps[0] = 0;

        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(repeatLength)) {
                repeatLength++;
                lps[i] = repeatLength;
                i++;
            } else {
                if (repeatLength != 0) {
                    repeatLength = lps[repeatLength - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int len = lps[str.length() - 1];

        return len > 0 && str.length() % (str.length() - len) == 0;
    }
}