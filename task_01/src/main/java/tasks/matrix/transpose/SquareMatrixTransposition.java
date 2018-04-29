package tasks.matrix.transpose;

/**
 * SquareMatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 04/29/2018
 */
public class SquareMatrixTransposition {

    public void transposeSquareMatrixMatrix(int[][] squareMatrix) {
        int temp;
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[i].length; j++) {
                temp = squareMatrix[i][j];
                squareMatrix[i][j] = squareMatrix[j][i];
                squareMatrix[j][i] = temp;
            }
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
