public class StringExercise07 {
    public String extractString(String str) {
        int numberLevel = 1;
        int number = 0;
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number += Character.getNumericValue(ch) * numberLevel;
                numberLevel *= 10;
            } else {
                for (int j = 0; j < number - 1; j++) {
                    result.append(ch);
                }

                result.append(ch);
                numberLevel = 1;
                number = 0;
            }
        }

        return result.reverse().toString();
    }
}
