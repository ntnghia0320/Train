import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise12Test {
    Exercise12 exercise12 = new Exercise12();

    @Test
    public void test_sqrt() {
        assertEquals(exercise12.sqrt(3), 1.7320508, exercise12.E);
        assertEquals(exercise12.sqrt(7), 2.6457513, exercise12.E);
        assertEquals(exercise12.sqrt(10), 3.162277, exercise12.E);
    }
}