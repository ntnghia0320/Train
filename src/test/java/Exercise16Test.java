import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise16Test {
    Exercise16 exercise16 = new Exercise16();

    @Test
    public void test_countFibonaci(){
        assertEquals(exercise16.countFibonaci(8), 6);
        assertEquals(exercise16.countFibonaci(7), 5);
        assertEquals(exercise16.countFibonaci(14), 7);
    }
}
