import java.util.Arrays;

public class ArrayExercise07 {
    public int[] findSubArray(int[] arr) {
        int lenMax = 1;
        int lenCurrent = 1;
        int maxIndex = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                lenCurrent++;
                if (lenMax < lenCurrent) {
                    lenMax = lenCurrent;
                    maxIndex = i + 2;
                }
            }else {
                lenCurrent = 1;
            }
        }

        return Arrays.copyOfRange(arr, maxIndex - lenMax, maxIndex);
    }
}
