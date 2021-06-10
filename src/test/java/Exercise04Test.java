import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise04Test {
    Exercise04 exercise04 = new Exercise04();

    @Test
    public void test_phanTichThuaSoNguyenTo(){
        assertEquals(exercise04.fibonaci(8).toString(), "1 1 2 3 5 8");
        assertEquals(exercise04.fibonaci(12).toString(), "1 1 2 3 5 8");
        assertEquals(exercise04.fibonaci(7).toString(), "1 1 2 3 5");
    }
}
