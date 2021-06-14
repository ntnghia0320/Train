import java.util.ArrayList;
import java.util.HashMap;

public class Exercise01 {
    public String findDoubleNumber(int[] arrayBumber) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ArrayList<String> listNumberDouble = new ArrayList<>();

        for (Integer i : arrayBumber) {
            if (hashMap.get(i) != null) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (Integer i : hashMap.keySet()) {
            if(hashMap.get(i) == 2){
                listNumberDouble.add(String.valueOf(i));
            }
        }

        String result = String.join(" ", listNumberDouble);

        return result;
    }

}
