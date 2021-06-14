import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    Exercise01 exercise01 = new Exercise01();

    @Test
    public void test_findDoubleNumber() {
        assertEquals(exercise01.findDoubleNumber(new int[]{1, 1, 2, 3}), "1");
        assertEquals(exercise01.findDoubleNumber(new int[]{1, 1, 2, 3, 3, 4, 9, 0, 0, 0}), "1 3");
    }
}
