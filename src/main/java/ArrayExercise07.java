import java.util.Arrays;

public class ArrayExercise07 {
    public int[] findSubArray(int[] arr) {
        int n = arr.length - 1;
        int lenMax = 1;
        int lenCurrent = 1;
        int maxIndex = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                lenCurrent++;
            } else {
                if (lenMax < lenCurrent) {
                    lenMax = lenCurrent;
                    maxIndex = i + 1;
                }
                lenCurrent = 1;
            }
        }

        if (lenMax < lenCurrent) {
            lenMax = lenCurrent;
            maxIndex = n + 1;
        }

        int indexStart = maxIndex - lenMax;

        return Arrays.copyOfRange(arr, indexStart, maxIndex);
    }
}
