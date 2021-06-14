import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise19Test {
    Exercise19 exercise19 = new Exercise19();

    @Test
    public void test_intToRoman() {
        assertEquals(exercise19.intToRoman(99), "XCIX");
        assertEquals(exercise19.intToRoman(499), "CDXCIX");
        assertEquals(exercise19.intToRoman(9), "IX");
        assertEquals(exercise19.intToRoman(123), "CXXIII");
        assertEquals(exercise19.intToRoman(998), "CMXCVIII");
        assertEquals(exercise19.intToRoman(2948), "MMCMXLVIII");
    }
}
