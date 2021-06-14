import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise18Test {
    Exercise18 exercise18 = new Exercise18();

    @Test
    public void test_romanToInt(){
        assertEquals(exercise18.romanToInt("DLXXVIII"), 578);
        assertEquals(exercise18.romanToInt("DCXCIX"), 699);
        assertEquals(exercise18.romanToInt("CMXCII"), 992);
        assertEquals(exercise18.romanToInt("MCMXCIX"), 1999);
    }
}
