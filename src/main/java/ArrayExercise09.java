public class ArrayExercise09 {
    public int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            int mid = (right + left) / 2;

            if (arr[mid] == x) {
                return x;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
