public class StringExercise07 {
    public String extractString(String str) {
        int n = str.length();
        int number;
        char charRepeated = ' ';
        char currentChar;
        StringBuilder tempNumber = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < n; i++) {
            currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                tempNumber.append(currentChar);

                if (charRepeated == ' ') {
                    charRepeated = str.charAt(i - 1);
                }
            } else if (tempNumber.length() > 0) {
                number = Integer.parseInt(String.valueOf(tempNumber));
                result.append(String.valueOf(charRepeated).repeat(Math.max(0, number)));
                charRepeated = ' ';
                tempNumber.setLength(0);
            } else {
                result.append(str.charAt(i - 1));
            }
        }

        if (tempNumber.length() > 0) {
            number = Integer.parseInt(String.valueOf(tempNumber));
            result.append(String.valueOf(charRepeated).repeat(Math.max(0, number)));
        } else {
            result.append(str.charAt(n - 1));
        }

        return result.toString();
    }
}
