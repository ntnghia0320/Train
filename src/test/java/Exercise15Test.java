import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise15Test {
    Exercise15 exercise15 = new Exercise15();

    @Test
    public void test_reverseBit(){
        assertEquals(exercise15.reverseBit(23), 29);
    }
}
