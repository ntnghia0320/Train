public class ArrayExercise03 {
    public int findSumEvenMinusSumOdd(int[] arrayNumber) {
        int result = 0;

        for (int i : arrayNumber) {
            result += i % 2 == 0 ? i : -i;
        }

        return result;
    }
}
