import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise08Test {
    ArrayExercise08 arrayExercise08 = new ArrayExercise08();

    @Test
    public void test_minusMaxMin(){
        assertEquals(arrayExercise08.minusMaxMin(new int[]{1,2,3,2,3,5,3,4,9,1,2}), 8);
        assertEquals(arrayExercise08.minusMaxMin(new int[]{1,2,3,2,3,-5,3,4,6,1,2}), 11);
    }
}