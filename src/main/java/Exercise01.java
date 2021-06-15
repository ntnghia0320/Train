import java.util.ArrayList;
import java.util.HashMap;

public class Exercise01 {
    public String findDoubleNumber(int[] arrayBumber) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ArrayList<String> listNumberDouble = new ArrayList<>();

        for (Integer i : arrayBumber) {
            hashMap.merge(i, 1, Integer::sum);
        }

        for (Integer i : hashMap.keySet()) {
            if (hashMap.get(i) >= 2) {
                listNumberDouble.add(String.valueOf(i));
            }
        }

        return String.join(" ", listNumberDouble);
    }

}
