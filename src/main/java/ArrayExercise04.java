import java.util.Arrays;
import java.util.Collections;

public class ArrayExercise04 {
    public Integer[] sortEvenOdd(Integer[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            while (arr[l] % 2 == 0 && l < r) l++;

            while (arr[r] % 2 != 0 && l < r) r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        if (l == n - 1) l = n;

        Arrays.sort(arr, 0, l);
        Arrays.sort(arr, l, n, Collections.reverseOrder());

        return arr;
    }
}