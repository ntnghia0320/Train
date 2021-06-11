import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise08Test {
    Exercise08 exercise08 = new Exercise08();

    @Test
    public void test_calculatePi() {
        assertEquals(exercise08.calculatePi(), 3.1414000495854166);
    }
}