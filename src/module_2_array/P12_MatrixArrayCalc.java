package module_2_array;

public class P12_MatrixArrayCalc {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 2, 3, 4 }, { 5, 2, 3 } };
		int[][] secondMatrix = { { -4, 5, 3 }, { 5, 6, 3 } };

		// Adding two matrices
		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}

		// Subtracting two matrices
		int[][] sub = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sub[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
			}
		}

		// Displaying the addition result
		System.out.println("Sum of two matrices is:");
		for (int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

		// Displaying the subtraction result
		System.out.println("Subtraction of two matrices is:");
		for (int[] row : sub) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

		int rowsA = 2, columnsA = 3;
		int rowsB = 3, columnsB = 2;
		int[][] matrixA = { { 2, 3, 4 }, { 5, 2, 3 } };
		int[][] matrixB = { { -4, 5 }, { 5, 6 }, { 3, 2 } };

		// Multiplying two matrices
		int[][] product = new int[rowsA][columnsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsA; k++) {
					product[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		// Displaying the result
		System.out.println("Product of two matrices is:");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}