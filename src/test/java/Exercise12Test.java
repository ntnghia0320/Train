import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise12Test {
    Exercise12 exercise12 = new Exercise12();

    @Test
    public void test_sqrt() {
        assertEquals(exercise12.sqrt(3), 1.7320508100147274);
        assertEquals(exercise12.sqrt(9), 3.000000001396984);
        assertEquals(exercise12.sqrt(10), 3.162277665175675);
    }
}