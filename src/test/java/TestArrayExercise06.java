import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArrayExercise06 {
    ArrayExercise06 arrayExercise06 = new ArrayExercise06();

    @Test
    public void test_sort() {
        assertArrayEquals(arrayExercise06.sort(new int[]{3, 12, 10, 41, -2, 7}), new int[]{41, -2, 10, 7, 12, 3});
        assertArrayEquals(arrayExercise06.sort(new int[]{1, 3, 5, -1, 6, 4}), new int[]{5, 3, 1, -1, 4, 6});
    }
}
