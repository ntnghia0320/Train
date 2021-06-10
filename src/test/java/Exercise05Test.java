import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise05Test {
    Exercise05 exercise05 = new Exercise05();
    @Test
    public void test_solveQuadraticEquation(){
        assertEquals(exercise05.solveQuadraticEquation(3, -5, 2).toString(), "x1 = 1.0, x2 = 0.6666666666666666");
        assertEquals(exercise05.solveQuadraticEquation(4, 5, 6).toString(), "no solution");
        assertEquals(exercise05.solveQuadraticEquation(1, 8, 16).toString(), "x1 = x2 = -4");
    }
}