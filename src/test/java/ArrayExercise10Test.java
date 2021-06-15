import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExercise10Test {
    ArrayExercise10 arrayExercise10 = new ArrayExercise10();

    @Test
    public void test_insertX() {
        assertArrayEquals(arrayExercise10.insertX(new int[]{1, 2, 3, 5, 6, 7, 8}, 4), new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(arrayExercise10.insertX(new int[]{1, 2, 3, 5, 6, 7, 8}, 0), new int[]{0, 1, 2, 3, 5, 6, 7, 8});
        assertArrayEquals(arrayExercise10.insertX(new int[]{1, 2, 3, 5, 6, 7, 8}, 9), new int[]{1, 2, 3, 5, 6, 7, 8, 9});
        assertArrayEquals(arrayExercise10.insertX(new int[]{1, 2, 3, 5, 6, 7, 8}, 2), new int[]{1, 2, 2, 3, 5, 6, 7, 8});
    }
}
