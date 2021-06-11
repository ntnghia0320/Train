import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise18Test {
    Exercise18 exercise18 = new Exercise18();

    @Test
    public void test_(){
        assertEquals(exercise18.translateRomanNumber("CV"), 105);
    }
}
