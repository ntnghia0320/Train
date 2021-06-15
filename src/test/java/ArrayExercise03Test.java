import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise03Test {
    ArrayExercise03 arrayExercise03 = new ArrayExercise03();

    @Test
    public void test_findSumEvenMinusSumOdd() {
        assertEquals(arrayExercise03.findSumEvenMinusSumOdd(new int[]{1, 2, 3, 4, 5, 6, 7}), -4);
        assertEquals(arrayExercise03.findSumEvenMinusSumOdd(new int[]{1, 2, 3, 4}), 2);
        assertEquals(arrayExercise03.findSumEvenMinusSumOdd(new int[]{1, 3, 1, 1, 14}), 8);
    }
}
