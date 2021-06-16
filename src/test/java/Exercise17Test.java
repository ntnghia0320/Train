import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise17Test {
    Exercise17 exercise17 = new Exercise17();

    @Test
    public void test_calculateSqrt() {
        assertEquals(exercise17.calculateSqrt(3), 1.73205080, exercise17.E);
    }
}