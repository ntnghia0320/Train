import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {
    Exercise04 exercise04 = new Exercise04();

    @Test
    public void test_sortEvenOdd() {
        assertEquals(exercise04.sortEvenOdd(new Integer[]{1, 2, 3, 4, 5, 6, 8, 3, 5, 6, 23, 34, 32}), "2 4 6 6 8 32 34 23 5 5 3 3 1");
        assertEquals(exercise04.sortEvenOdd(new Integer[]{1, 3, 5, 7, 5, 7, 5, 9, 21, 43}), "43 21 9 7 7 5 5 5 3 1");
        assertEquals(exercise04.sortEvenOdd(new Integer[]{2, 4, 2, 4, 42, 6, 8, 64, 52, 54}), "2 2 4 4 6 8 42 52 54 64");
    }
}
