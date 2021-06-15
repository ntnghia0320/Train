import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise05Test {
    ArrayExercise05 arrayExercise05 = new ArrayExercise05();

    @Test
    public void test_sumInteger() {
        assertEquals(arrayExercise05.sumInteger(new int[]{2,8,1,9,3,7,4,6}), 40);
    }
}
