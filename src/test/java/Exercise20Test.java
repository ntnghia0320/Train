import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise20Test {
    Exercise20 exercise20 = new Exercise20();

    @Test
    public void test_happyNumber() {
        assertEquals(exercise20.happyNumber(19), true);
        assertEquals(exercise20.happyNumber(10000), true);
        assertEquals(exercise20.happyNumber(8), false);
    }
}
