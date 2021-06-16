import java.util.ArrayList;
import java.util.HashMap;

public class StringExercise05 {
    public String findRepeatChar(String str){
        int n  = str.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Character> result = new ArrayList<>();

        for(int i = 0;i<n;i++){
            hashMap.merge(str.charAt(i), 1, Integer::sum);
        }

        for (Character i : hashMap.keySet()) {
            if (hashMap.get(i) >= 2) {
                result.add(i);
            }
        }

        return result.toString().replaceAll("[,\\s\\p{Blank}\\[\\]]", "");
    }
}
