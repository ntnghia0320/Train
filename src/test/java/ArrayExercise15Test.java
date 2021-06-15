import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExercise15Test {
    ArrayExercise15 arrayExercise15 = new ArrayExercise15();

    @Test
    public void test_findKNumber() {
        assertArrayEquals(arrayExercise15.findKNumber(new int[]{1, 2, 3, 4, 5}, 2), new int[]{4, 5});
        assertArrayEquals(arrayExercise15.findKNumber(new int[]{1, 1, 4, 4, 5, 3, 4, 5}, 2), new int[]{5, 5});
    }
}
