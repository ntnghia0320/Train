public class ArrayExercise12 {
    public boolean checkSimilarArrays(int[] a, int[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    break;
                }
            }
        }

        return count == a.length;
    }
}
