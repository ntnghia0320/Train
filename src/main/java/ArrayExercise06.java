public class ArrayExercise06 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] % 2 == arr[j] % 2) {
                    if ((arr[i] > arr[j]) == (arr[i] % 2 == 0)) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
