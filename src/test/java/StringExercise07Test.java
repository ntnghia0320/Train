import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise07Test {
    StringExercise07 stringExercise07 = new StringExercise07();

    @Test
    public void test_extractString() {
        assertEquals(stringExercise07.extractString("abc4e6fd"), "abcccceeeeeefd");
        assertEquals(stringExercise07.extractString("ab13c"), "abbbbbbbbbbbbbc");
        assertEquals(stringExercise07.extractString("ab13"), "abbbbbbbbbbbbb");
    }
}
