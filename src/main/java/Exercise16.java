public class Exercise16 {
    public int countFibonaci(int n) {
        int numberBefore = 1;
        int numberCurrent = 1;
        int countFibonaci = 1;

        while (numberCurrent <= n) {
            numberCurrent = numberBefore + numberCurrent;
            numberBefore = numberCurrent - numberBefore;
            countFibonaci++;
        }

        return countFibonaci;
    }
}
