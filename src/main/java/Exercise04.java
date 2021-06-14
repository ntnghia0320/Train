import java.util.ArrayList;

public class Exercise04 {
    public String sortEvenOdd(Integer[] arrayNumber) {
        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<String> listNumberResult = new ArrayList<>();

        for (Integer i : arrayNumber) {
            if (i % 2 == 0) {
                arrEven.add(i);
            } else {
                arrOdd.add(i);
            }
        }

        sort(arrEven, 0, arrEven.size() - 1);
        sort(arrOdd, 0, arrOdd.size() - 1);

        for (Integer i : arrEven) {
            listNumberResult.add(String.valueOf(i));
        }

        int size = arrOdd.size() - 1;

        for (int i = size; i >= 0; i--) {
            listNumberResult.add(String.valueOf(arrOdd.get(i)));
        }

        String result = String.join(" ", listNumberResult);

        return result;
    }

    int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;

                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    void sort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

}