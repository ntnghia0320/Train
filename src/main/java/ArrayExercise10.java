public class ArrayExercise10 {
    public int[] insertX(int[] arr, int x) {
        boolean isInsert = false;
        int size = arr.length;
        int indexResult = 0;
        int[] arrResult = new int[size + 1];

        for (int i = 0; i < size; i++) {
            if (arr[i] >= x && !isInsert) {
                arrResult[indexResult] = x;
                indexResult++;
                isInsert = true;
            }

            arrResult[indexResult] = arr[i];
            indexResult++;
        }

        if (!isInsert) {
            arrResult[size] = x;
        }

        return arrResult;
    }
}
