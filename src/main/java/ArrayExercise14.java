public class ArrayExercise14 {
    private static int[][] getCofactor(int[][] source, int columnToRemove) {
        int length = source.length;
        int[][] temp = new int[length - 1][length - 1];

        for (int row = 1; row < length; row++) {
            for (int col = 0; col < length; col++) {
                if (col < columnToRemove) {
                    temp[row - 1][col] = source[row][col];
                } else if (col > columnToRemove) {
                    temp[row - 1][col - 1] = source[row][col];
                }
            }
        }

        return temp;
    }

    public int calculateDeterminant(int[][] matrix) {
        if (matrix.length == 1) return matrix[0][0];

        int determinant = 0;
        int sign = 1;

        for (int column = 0; column < matrix.length; column++) {
            int[][] temp = getCofactor(matrix, column);
            determinant += sign * matrix[0][column] * calculateDeterminant(temp);
            sign = -sign;
        }

        return determinant;
    }
}

