import java.util.ArrayList;
import java.util.HashMap;

public class ArrayExercise01 {
    public String findDoubleNumber(int[] arrayNumber) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ArrayList<String> listNumberDouble = new ArrayList<>();

        for (int i : arrayNumber) {
            hashMap.merge(i, 1, Integer::sum);
        }

        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) >= 2) {
                listNumberDouble.add(String.valueOf(i));
            }
        }

        return String.join(" ", listNumberDouble);
    }

}
