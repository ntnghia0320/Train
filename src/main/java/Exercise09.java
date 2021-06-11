public class Exercise09 {
    public double calculatePi(){
        double e = 1.0, sum = 0.0;
        int n = 2;

        while(e > 0.00001){
            if(n % 4 == 0)
                sum -= 1.0 / (n * (n + 1) * (n + 2));
            else
                sum += 1.0 / (n * (n + 1) * (n + 2));

            e = Math.abs(3 + sum * 4 - 3.14159);
            n += 2;
        }

        return 3 + sum * 4;
    }
}