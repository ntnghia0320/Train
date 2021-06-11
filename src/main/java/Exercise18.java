import java.util.ArrayList;

public class Exercise18 {
    public int translateRomanNumber(String romanNumber){
        ArrayList<String> result = new ArrayList<>();
        int[] myNum = {0, 0, 0, 0};
        int number = 0;

        char[] ch = romanNumber.toCharArray();

        for (char c : ch) {
            if(c == 'M'){
                number += 1000;
            } else if(c == 'C'){
                flag = 100;
            }
        }

        return 0;
    }
}
