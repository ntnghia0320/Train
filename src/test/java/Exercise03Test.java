import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise03Test {
    Exercise03 exercise03 = new Exercise03();

    @Test
    public void test_findSumEvenMinusSumOdd() {
        assertEquals(exercise03.findSumEvenMinusSumOdd(new int[]{1, 2, 3, 4, 5, 6, 7}), -4);
        assertEquals(exercise03.findSumEvenMinusSumOdd(new int[]{1, 2, 3, 4}), 2);
        assertEquals(exercise03.findSumEvenMinusSumOdd(new int[]{1, 3, 1, 1, 14}), 8);
    }
}
