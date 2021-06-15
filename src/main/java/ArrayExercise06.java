import java.util.ArrayList;
import java.util.Collections;

public class ArrayExercise06 {
    public int[] sort(int[] arr) {
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                listEven.add(i);
            } else {
                listOdd.add(i);
            }
        }

        Collections.sort(listEven);
        listOdd.sort(Collections.reverseOrder());

        int evenIndex = 0;
        int oddIndex = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = listEven.get(evenIndex);
                evenIndex++;
            } else {
                arr[i] = listOdd.get(oddIndex);
                oddIndex++;
            }
        }

        return arr;
    }
}
