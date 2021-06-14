import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise20Test {
    Exercise20 exercise20 = new Exercise20();

    @Test
    public void test_happyNumber() {
        assertTrue(exercise20.happyNumber(19));
        assertTrue(exercise20.happyNumber(10000));
        assertFalse(exercise20.happyNumber(8));
    }
}
