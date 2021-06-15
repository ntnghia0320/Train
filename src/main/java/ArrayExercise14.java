public class ArrayExercise14 {
    private static void getCofactor(int[][] mat, int[][] temp, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != 0 && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    private static int determinantOfMatrix(int[][] mat, int n) {
        if (n == 1) return mat[0][0];

        int D = 0;
        int[][] temp = new int[n][n];
        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, f, n);
            D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);
            sign = -sign;
        }

        return D;
    }

    public int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;

        return determinantOfMatrix(matrix, n);
    }
}

