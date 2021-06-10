public class Exercise04 {
    public StringBuilder fibonaci(int n){
        StringBuilder result = new StringBuilder("1");
        int numberBefore = 1;
        int numberCurrent = 1;
        while(numberCurrent <= n){
            numberCurrent = numberBefore + numberCurrent;
            numberBefore = numberCurrent - numberBefore;

            result.append(" " + numberBefore);
        }

        return result;
    }
}
