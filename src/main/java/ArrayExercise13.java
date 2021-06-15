public class ArrayExercise13 {
    public int[][] deleteXY(int[][] matrix, int x, int y) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        int l = 0;

        int[][] matrixResult = new int[m - 1][n - 1];
        for (int i = 0; i < m; i++) {
            if (i == x - 1) continue;
            for (int j = 0; j < n; j++) {
                if (j == y - 1) continue;
                matrixResult[k][l] = matrix[i][j];

                l++;
            }

            l = 0;
            k++;
        }

        return matrixResult;
    }
}
