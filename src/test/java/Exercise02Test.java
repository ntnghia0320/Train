import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {

    Exercise02 exercise02 = new Exercise02();
    @Test
    public void test_tongCacChuSo() {
        assertEquals(exercise02.tongCacChuSo(8), 8);
        assertEquals(exercise02.tongCacChuSo(81), 9);
        assertEquals(exercise02.tongCacChuSo(8291), 20);
        assertEquals(exercise02.tongCacChuSo(1091), 11);
    }
}