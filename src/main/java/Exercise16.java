public class Exercise16 {
    public int countFibonaci(int n){
        int numberBefore = 1, numberCurrent = 1, countFibonaci = 1;

        while(numberCurrent <= n){
            numberCurrent = numberBefore + numberCurrent;
            numberBefore = numberCurrent - numberBefore;

            countFibonaci++;
        }

        return countFibonaci;
    }
}
