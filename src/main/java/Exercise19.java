public class Exercise19 {
    public static final String[] m = {
            "", "M", "MM", "MMM"};
    public static final String[] c = {
            "", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"};
    public static final String[] x = {
            "", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};
    public static final String[] i = {
            "",
            "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        return String.join("", m[num / 1000], c[(num % 1000) / 100], x[(num % 100) / 10], i[num % 10]);
    }
}
