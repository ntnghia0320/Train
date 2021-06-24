import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise11Test {
    StringExercise11 stringExercise11 = new StringExercise11();

    @Test
    public void test_minusStringNumber() {
        assertEquals(stringExercise11.minusStringNumber("789", "456"), "333");
        assertEquals(stringExercise11.minusStringNumber("2789", "456"), "2333");
        assertEquals(stringExercise11.minusStringNumber("456", "2789"), "-2333");
        assertEquals(stringExercise11.minusStringNumber("456", "789"), "-333");
        assertEquals(stringExercise11.minusStringNumber("456", "289"), "167");
    }
}