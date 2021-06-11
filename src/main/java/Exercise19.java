public class Exercise19 {
    public String intToRoman(int num) {
        final String m[] = {"", "M", "MM", "MMM"};
        final String c[] = {"", "C", "CC", "CCC", "CD", "D",
                "DC", "DCC", "DCCC", "CM"};
        final String x[] = {"", "X", "XX", "XXX", "XL", "L",
                "LX", "LXX", "LXXX", "XC"};
        final String i[] = {"", "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX"};

        String result = String.join("", m[num / 1000], c[(num % 1000) / 100], x[(num % 100) / 10], i[num % 10]);

        return result;
    }
}
