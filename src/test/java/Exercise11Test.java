import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise11Test{
    Exercise11 exercise11 = new Exercise11();
    @Test
    public void test_findMonth(){
        assertEquals(exercise11.findMonth(1), "January");
        assertEquals(exercise11.findMonth(2), "February");
        assertEquals(exercise11.findMonth(3), "March");
        assertEquals(exercise11.findMonth(4), "April");
        assertEquals(exercise11.findMonth(5), "May");
        assertEquals(exercise11.findMonth(6), "June");
        assertEquals(exercise11.findMonth(7), "July");
        assertEquals(exercise11.findMonth(8), "August");
        assertEquals(exercise11.findMonth(9), "September");
        assertEquals(exercise11.findMonth(10), "October");
        assertEquals(exercise11.findMonth(11), "November");
        assertEquals(exercise11.findMonth(12), "December");
    }
}
