import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise07Test {

    Exercise07 exercise07 = new Exercise07();
    @Test
    public void test_tinhGiaiThua() {
        assertEquals(exercise07.tinhGiaiThua(5), 120);
        assertEquals(exercise07.tinhGiaiThua(6), 720);
    }
}