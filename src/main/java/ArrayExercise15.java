import java.util.Arrays;

public class ArrayExercise15 implements kMaxInArray {

    @Override
    public int[] findKNumber(int[] arr, int k) {
        Arrays.sort(arr);

        return Arrays.copyOfRange(arr, arr.length - k, arr.length);
    }
}
