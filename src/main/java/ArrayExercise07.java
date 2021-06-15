import java.util.Arrays;

public class ArrayExercise07 {
    public int[] findSubArray(int[] arr) {
        int n = arr.length - 1;
        int lenMax = 1;
        int lenCurrent = 1;
        int maxIndex = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i++]) {
                lenCurrent++;
            } else {
                if (lenMax < lenCurrent) {
                    lenMax = lenCurrent;
                    maxIndex = i++;
                }
                lenCurrent = 1;
            }
        }

        if (lenMax < lenCurrent) {
            lenMax = lenCurrent;
            maxIndex = n++;
        }

        int indexStart = maxIndex - lenMax;

        return Arrays.copyOfRange(arr, indexStart, maxIndex);
    }
}
