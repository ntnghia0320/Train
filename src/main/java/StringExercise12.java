public class StringExercise12 {
    public String createMaxNumber(int[] arr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Integer.parseInt(arr[i] + "" + arr[j]) < Integer.parseInt(arr[j] + "" + arr[i])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            result.append(arr[i]);
        }

        return String.join("", result);
    }
}
