import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExercise04Test {
    StringExercise04 stringExercise04 = new StringExercise04();

    @Test
    public void test_(){
        assertTrue(stringExercise04.isRepeatString("abcabc"));
        assertTrue(stringExercise04.isRepeatString("abcabcabc"));
        assertFalse(stringExercise04.isRepeatString("abcabcbca"));
        assertFalse(stringExercise04.isRepeatString("abcabcbcad"));
    }
}
