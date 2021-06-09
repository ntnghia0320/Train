
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    @Test
    public void test_sum(){
        assertEquals(new Demo().sum(2, 8), 10);
    }

    @Test
    public void test_sub(){
        assertEquals(new Demo().sub(8, 3), 5);
    }

    @Test
    public void test_multiple(){
        assertEquals(new Demo().multiple(8, 3), 24);
    }

    @Test
    public void test_max(){
        Demo demo = new Demo();
        assertEquals(demo.max(8, 3, 7), 8);
        assertEquals(demo.max(8, 10, 7), 10);
        assertEquals(demo.max(8, 10, 70), 70);
        assertEquals(demo.max(8, 5, 70), 70);
        assertEquals(demo.max(8, 60, 0), 60);
    }

}