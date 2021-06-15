import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayExercise12Test {
    ArrayExercise12 arrayExercise12 = new ArrayExercise12();

    @Test
    public void test_() {
        assertTrue(arrayExercise12.checkSimilarArrays(new int[]{1, 3, 4, 2}, new int[]{2, 3, 4, 1}));
    }
}
