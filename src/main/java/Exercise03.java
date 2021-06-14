public class Exercise03 {
    public int findSumEvenMinusSumOdd(int[] arrayNumber) {
        int result = 0;

        for (Integer i : arrayNumber) {
            result += i % 2 == 0 ? i : -i;
        }

        return result;
    }
}
