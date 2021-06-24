import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise10Test {
    StringExercise10 stringExercise10 = new StringExercise10();

    @Test
    public void test_subStringNumber() {
        assertEquals(stringExercise10.subStringNumber("789", "456"), "1245");
        assertEquals(stringExercise10.subStringNumber("9", "100"), "109");
        assertEquals(stringExercise10.subStringNumber("2789", "456"), "3245");
        assertEquals(stringExercise10.subStringNumber("456", "2789"), "3245");
    }
}
