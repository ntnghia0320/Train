import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise09Test {
    StringExercise09 stringExercise09 = new StringExercise09();

    @Test
    public void test_createBarcode(){
        assertEquals(stringExercise09.createBarcode("893850597419"), 4);
    }
}
