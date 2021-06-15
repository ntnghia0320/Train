public class ArrayExercise11 {
    public int maxSumSubArray(int[] arr) {
        int size = arr.length;
        int max = arr[0];
        int maxCurrent = 0;

        for (int i = 0; i < size; i++) {
            maxCurrent += arr[i];
            if (max < maxCurrent)
                max = maxCurrent;
            if (maxCurrent < 0)
                maxCurrent = 0;
        }
        return max;
    }
}
