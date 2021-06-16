public class StringExercise03 {
    public int findSumNumber(String str) {
        StringBuilder temp = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp.append(ch);
            } else if (temp.length() > 0) {
                sum += Integer.parseInt(String.valueOf(temp));
                temp.setLength(0);
            }
        }

        return temp.length() > 0 ? sum + Integer.parseInt(String.valueOf(temp)) : sum;
    }
}
