import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringExercise08Test {
    StringExercise08 stringExercise08 = new StringExercise08();

    @Test
    public void test_checkBarcode(){
        assertTrue(stringExercise08.checkBarcode("8938505974194"));
        assertFalse(stringExercise08.checkBarcode("8938505974190"));
    }
}
