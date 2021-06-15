import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExercise07Test {
    ArrayExercise07 arrayExercise07 = new ArrayExercise07();

    @Test
    public void test_findSubArray() {
        assertArrayEquals(arrayExercise07.findSubArray(new int[]{6,5,4,3,2,1}), new int[]{6});
        assertArrayEquals(arrayExercise07.findSubArray(new int[]{3, 3, 4, 1, 2, 3, 4}), new int[]{1, 2, 3,4});
        assertArrayEquals(arrayExercise07.findSubArray(new int[]{3, 3, 4, 1, 2, 3, 3, 4}), new int[]{1, 2, 3});
        assertArrayEquals(arrayExercise07.findSubArray(new int[]{1, 3, 4, 1, 2, 3, 5, 3, 4, 5}), new int[]{1, 2, 3, 5});
    }
}
