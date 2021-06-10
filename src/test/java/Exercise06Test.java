import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise06Test {

    Exercise06 exercise06 = new Exercise06();
    @Test
    public void test_tongCacChuSo() {
        assertEquals(exercise06.tongDaySo(3), 20);
        assertEquals(exercise06.tongDaySo(5), 70);
    }
}