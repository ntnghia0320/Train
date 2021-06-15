import java.util.Arrays;

public class ArrayExercise09 {
    public int findNumber(int[] arr, int x) {
        int midIndex = arr.length / 2;

        if (midIndex == 0) {
            return arr[midIndex] == x ? x : -1;
        } else if (arr[midIndex] == x) {
            return x;
        } else if (x > arr[midIndex]) {
            return findNumber(Arrays.copyOfRange(arr, midIndex, arr.length), x);
        } else {
            return findNumber(Arrays.copyOfRange(arr, 0, midIndex), x);
        }
    }
}
