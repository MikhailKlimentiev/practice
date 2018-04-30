package tasks.matrix.transpose;

import java.util.Scanner;

/**
 * SquareMatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 3.0
 * @since 04/30/2018
 */
public class SquareMatrixTransposition {

    /**
     * getSizeAndInitializeMatrix
     * this method gets size of square matrix from console, creates square matrix, initializes square matrix
     * with random numbers, prints in console initial square matrix, returns square matrix.
     *
     * @param scan - gets square matrix size from console
     * @return squareMatrix - initialized square matrix
     */
    public int[][] getSizeAndCreateAndInitializeMatrix(Scanner scan) {
        int squareMatrixSize = 0;
        int temp;
        boolean condition = true;

        while (condition) {
            System.out.println("Please enter matrix size: ");
            if (scan.hasNextInt()) {
                squareMatrixSize = scan.nextInt();
                condition = false;
            } else {
                System.err.println("You entered not a number. Please try again.\n");
                scan.next();
            }
        }
        int[][] squareMatrix = new int[squareMatrixSize][squareMatrixSize];

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                squareMatrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        System.out.println("Initial Square Matrix: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return squareMatrix;
    }

    /**
     * transposeMatrix
     * this method transposes received square matrix, prints transposed square matrix in console
     *
     * @param squareMatrix - initialized square matrix
     */
    public void transposeMatrix(int[][] squareMatrix) {
        int temp;

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i + 1; j < squareMatrix[i].length; j++) {
                temp = squareMatrix[i][j];
                squareMatrix[i][j] = squareMatrix[j][i];
                squareMatrix[j][i] = temp;
            }
        }

        System.out.println("Transposed Square Matrix: ");
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================================");
    }
}
