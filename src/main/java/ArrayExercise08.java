public class ArrayExercise08 {
    public int minusMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        return max - min;
    }
}