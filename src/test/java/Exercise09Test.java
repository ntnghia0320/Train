import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise09Test {
    Exercise09 exercise09 = new Exercise09();

    @Test
    public void test_calculatePi() {
        assertEquals(exercise09.calculatePi(), 3.1415975817522517);
    }
}
