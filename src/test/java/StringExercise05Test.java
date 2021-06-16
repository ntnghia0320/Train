import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise05Test {
    StringExercise05 stringExercise05 = new StringExercise05();

    @Test
    public void test_(){
        assertEquals(stringExercise05.findRepeatChar("asnkmasd"), "as");
    }
}
