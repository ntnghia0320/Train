import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise03Test {
    StringExercise03 stringExercise03 = new StringExercise03();

    @Test
    public void test_(){
        assertEquals(stringExercise03.findSumNumber("abc 123 def 33 mn 3.221"),380);
        assertEquals(stringExercise03.findSumNumber("ab100 def0mn10.2000.... 0 0 ,"),2110);
    }
}
