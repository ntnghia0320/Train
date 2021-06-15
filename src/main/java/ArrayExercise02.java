import java.util.Arrays;

public class ArrayExercise02 {
    public int findMaxSum(int[] arrayNumber) {
        Arrays.sort(arrayNumber);
        return arrayNumber[arrayNumber.length - 1] + arrayNumber[arrayNumber.length - 2] + arrayNumber[arrayNumber.length - 3];
    }
}
