import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise06Test {
    StringExercise06 stringExercise06 = new StringExercise06();

    @Test
    public void test_shortcutString(){
        assertEquals(stringExercise06.shortcutString("abcccceeeeeefd"),"abc4e6fd");
        assertEquals(stringExercise06.shortcutString("abcccceeeeee"),"abc4e6");
        assertEquals(stringExercise06.shortcutString("abbbbbbbbbbbbbc"),"ab13c");
    }
}
