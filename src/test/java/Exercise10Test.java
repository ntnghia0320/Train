import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10Test {
    Exercise10 exercise10 = new Exercise10();
    @Test
    public void test_solveQuadraticEquation(){
        assertEquals(exercise10.findDay(5, 8, 2015), "Wednesday");
        assertEquals(exercise10.findDay(10, 6, 2021).toString(), "Thursday");
    }
}