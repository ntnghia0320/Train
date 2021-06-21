import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise11Test {
    ArrayExercise11 arrayExercise11 = new ArrayExercise11();

    @Test
    public void test_maxSumSubArray() {
        assertEquals(arrayExercise11.maxSumSubArray(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}), 23);
    }
}
