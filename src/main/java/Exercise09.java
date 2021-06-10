public class Exercise09 {
    public double calculatePi(){
        double E = 0.00001;
        double e = 1, sum = 0.00000;
        int n = 2;

        while(e > E){
            e = 1.0 / (n * (n + 1) * (n + 2));

            if(n % 4 == 0)
                sum -= e;
            else
                sum += e;

            n += 2;
        }

        return 3 + sum * 4;
    }
}