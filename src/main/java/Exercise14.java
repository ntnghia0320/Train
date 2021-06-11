import java.util.ArrayList;

public class Exercise14 {
    public String findNumber(){
        ArrayList<String> listNumberCorrect = new ArrayList<>();

        for(int n = 10; n <= 99999; n++){
            int sum = 0, tempN = n, powNumber = 0;
            ArrayList<Integer> listNumber = new ArrayList<>();

            while(tempN > 0){
                listNumber.add(tempN % 10);
                powNumber++;
                tempN /= 10;
            }

            for(Integer i : listNumber){
                sum += Math.pow(i, powNumber);
            }

            if(sum == n){
                listNumberCorrect.add(String.valueOf(sum));
            }
        }

        return String.join(" ", listNumberCorrect);
    }
}