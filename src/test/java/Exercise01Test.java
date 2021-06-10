import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    Exercise01 exercise01 = new Exercise01();

    @Test
    public void test_gcd() {
        assertEquals(exercise01.gcd(2, 8), 2);
        assertEquals(exercise01.gcd(12, 8), 4);
    }

    @Test
    public void test_lcm() {
        assertEquals(exercise01.lcm(2, 8), 8);
        assertEquals(exercise01.lcm(12, 8), 24);
    }
}