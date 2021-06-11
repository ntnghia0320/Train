public class Exercise08 {
    public double calculatePi(){
        double e = 1.0;
        double sum = 0.0;

        int n = 0;
        
        while(e > 0.0001){
            if(n % 2 == 0)
                sum += 1.0 / (2 * n + 1);
            else
                sum -= 1.0 / (2 * n + 1);

            e = Math.abs(sum * 4 - 3.1415);

            n++;
        }

        sum *= 4;

        return sum;
    }
}
