import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExercise02Test {
    StringExercise02 stringExercise02 = new StringExercise02();

    @Test
    public void test_isSymmetry(){
        assertTrue(stringExercise02.isSymmetry("abcdvdcba"));
        assertTrue(stringExercise02.isSymmetry("abcddcba"));
        assertFalse(stringExercise02.isSymmetry("abcdacba"));
    }
}
