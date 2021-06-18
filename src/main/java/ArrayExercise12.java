import java.util.Arrays;

public class ArrayExercise12 {
    public boolean checkSimilarArrays(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length ; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}
