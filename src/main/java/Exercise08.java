public class Exercise08 {
    public float calculatePi(){
        float E = 0.0001f;
        float e = 1, sum = 0.0f;
        int n = 0;
        
        while(e > E){
            e = 1.0f / (2 * n + 1);

            if(n % 2 == 0)
                sum += e;
            else
                sum -= e;

            n++;
        }

        return sum * 4;
    }
}
