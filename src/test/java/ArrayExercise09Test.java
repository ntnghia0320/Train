import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise09Test {
    ArrayExercise09 arrayExercise09 = new ArrayExercise09();

    @Test
    public void test_findNumber(){
        assertEquals(arrayExercise09.findNumber(new int[]{1,2,3,4,5,6,7,8,9}, 3), 3);
        assertEquals(arrayExercise09.findNumber(new int[]{1,2,3,4,5,6,7,8,9}, 8), 8);
        assertEquals(arrayExercise09.findNumber(new int[]{1,2,3,4,5,6,7,8,9}, 11), -1);
    }
}