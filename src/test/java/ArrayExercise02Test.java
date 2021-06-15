import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise02Test {
    ArrayExercise02 exercise02 = new ArrayExercise02();

    @Test
    public void test_findMaxSum() {
        assertEquals(exercise02.findMaxSum(new int[]{1, 1, 4, 8, 3, 4, 5, 6, 7}), 21);
        assertEquals(exercise02.findMaxSum(new int[]{1, 12, 4, 8, 12, 10, 5, 6, 7}), 34);
        assertEquals(exercise02.findMaxSum(new int[]{1, 21, 4, 8, 10, 4, 9, 6, 7}), 40);
    }
}
