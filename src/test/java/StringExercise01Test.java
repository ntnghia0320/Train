import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExercise01Test {
    StringExercise01 stringExercise01 = new StringExercise01();

    @Test
    public void test_listSentences() {
        assertEquals(stringExercise01.listSentences("Mot ngay dep troi! Toi di code. Con ban?"),
                "Mot ngay dep troi\n Toi di code\n Con ban\n");
    }

}
