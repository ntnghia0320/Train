public class ArrayExercise13 {
    public int[][] deleteRowColumn(int[][] matrix, int columnToDelete, int rowToDelete) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] matrixResult = new int[rows - 1][columns - 1];

        for (int rowCurrent = 0; rowCurrent < rows; rowCurrent++) {
            if (rowCurrent == rowToDelete) continue;
            for (int columnCurrent = 0; columnCurrent < columns; columnCurrent++) {
                if (columnCurrent == columnToDelete) continue;

                int tempRow = rowCurrent <= rowToDelete ? rowCurrent : rowCurrent - 1;
                int tempColumn = columnCurrent <= columnToDelete ? columnCurrent : columnCurrent - 1;

                matrixResult[tempRow][tempColumn] = matrix[rowCurrent][columnCurrent];
            }
        }

        return matrixResult;
    }
}
