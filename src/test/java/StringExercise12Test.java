import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise12Test {
    StringExercise12 stringExercise12 = new StringExercise12();

    @Test
    public void test_createMaxNumber() {
        assertEquals(stringExercise12.createMaxNumber(new int[]{10, 2}), "210");
        assertEquals(stringExercise12.createMaxNumber(new int[]{46, 461}), "46461");
    }
}
