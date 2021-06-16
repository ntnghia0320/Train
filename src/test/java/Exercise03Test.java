import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Exercise03Test {
    Exercise03 exercise03 = new Exercise03();

    @Test
    public void test_phanTichThuaSoNguyenTo(){
        assertEquals(exercise03.phanTichThuaSoNguyenTo(600), "2 * 2 * 2 * 3 * 5 * 5");
        assertEquals(exercise03.phanTichThuaSoNguyenTo(5), "5");
        assertEquals(exercise03.phanTichThuaSoNguyenTo(999), "3 * 3 * 3 * 37");
    }
}
