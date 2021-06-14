public class Exercise02 {
    public int findMaxSum(int[] arrayNumber) {
        int size = arrayNumber.length;
        int max = 0;
        int sum = 0;
        int indexMax = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                if (arrayNumber[j] >= max) {
                    max = arrayNumber[j];
                    indexMax = j;
                }
            }

            sum += max;
            max = 0;
            arrayNumber[indexMax] = 0;
        }

        return sum;
    }
}
