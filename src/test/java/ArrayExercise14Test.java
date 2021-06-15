import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise14Test {
    ArrayExercise14 arrayExercise14 = new ArrayExercise14();

    @Test
    public void test_calculateDeterminant() {
        assertEquals(arrayExercise14.calculateDeterminant(new int[][]{
                {4, 6},
                {3, 8}}), 14);
        assertEquals(arrayExercise14.calculateDeterminant(new int[][]{
                {6,1,1},
                {4,-2,5},
                {2,8,7}}), -306);
    }
}