public class ArrayExercise12 {
    public boolean checkSimilarArrays(int[] a, int[] b) {
        int sizeA = a.length;
        int sizeB = b.length;
        int count = 0;
        int temp;

        if (sizeA != sizeB) return false;
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                if(a[i] == b[j]){
                    count++;
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    break;
                }
            }
        }

        return count == sizeA;
    }
}
