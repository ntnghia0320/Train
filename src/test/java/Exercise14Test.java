import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise14Test {

    Exercise14 exercise14 = new Exercise14();
    @Test
    public void test_findNumber() {
        assertEquals(exercise14.findNumber(), "153 370 371 407 1634 8208 9474 54748 92727 93084");
    }
}