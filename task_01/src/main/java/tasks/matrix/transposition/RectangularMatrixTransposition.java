package tasks.matrix.transposition;

import java.util.Scanner;

/**
 * RectangularMatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 2.0
 * @since 04/30/2018
 */
public class RectangularMatrixTransposition {

    /**
     * getHeightMatrix
     * this method gets height of matrix from console
     * @param scan height of matrix
     * @return n - height of matrix
     */
    public int getHeightMatrix(Scanner scan) {
        boolean condition = true;
        int n = 0;

        while (condition) {
            System.out.println("Please enter Height of Rectangular Matrix: ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                condition = false;
            } else {
                System.err.println("You inputted not a number. Please try again.");
                scan.next();
            }
        }
        return n;
    }

    /**
     * getWidthMatrix
     * this method gets width of matrix from console
     * @param scan width of matrix
     * @return m - width of matrix
     */
    public int getWidthMatrix(Scanner scan) {
        boolean condition = true;
        int m = 0;

        while (condition) {
            System.out.println("Please enter Width of Rectangular Matrix: ");
            if (scan.hasNextInt()) {
                m = scan.nextInt();
                condition = false;
            } else {
                System.err.println("You inputted not a number. Please try again.");
                scan.next();
            }
        }
        return m;
    }

    /**
     * createAndInitializeAndPrintInitialMatrix
     * this method creates matrix according to received size, initializes matrix with random numbers,
     * prints matrix in console, returns matrix
     * @param n height of matrix
     * @param m width of matrix
     * @return rectangularMatrix - initialized Matrix
     */
    public int[][] createAndInitializeAndPrintInitialMatrix(int n, int m) {
        int[][] rectangularMatrix = new int[n][];

        for (int i = 0; i < rectangularMatrix.length; i++) {
            rectangularMatrix[i] = new int[m];
        }

        for (int i = 0; i < rectangularMatrix.length; i++) {
            for (int j = 0; j < rectangularMatrix[i].length; j++) {
                rectangularMatrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
        System.out.println("Initial Rectangular Matrix:");
        for (int i = 0; i < rectangularMatrix.length; i++) {
            for (int j = 0; j < rectangularMatrix[i].length; j++) {
                System.out.print(rectangularMatrix[i][j] + " ");
            }
            System.out.println();

        }
        return rectangularMatrix;
    }

    /**
     * createTransposedMatrix
     * this method creates matrix to be transposed according to received size
     * @param n height of matrix
     * @param m width of matrix
     * @return transposedRectangularMatrix - matrix to be transposed
     */
    public int[][] createTransposedMatrix(int n, int m) {
        int[][] transposedRectangularMatrix = new int[m][];

        for (int i = 0; i < transposedRectangularMatrix.length; i++) {
            transposedRectangularMatrix[i] = new int[n];
        }
        return transposedRectangularMatrix;
    }

    /**
     * transposeAndPrintRectangularMatrix
     * this method transposes initial matrix, prints transposed matrix in console
     * @param n height of matrix
     * @param m width of matrix
     * @param rectangularMatrix - initial matrix
     * @param transposedMatrix - transposed matrix
     */
    public void transposeAndPrintRectangularMatrix(int n, int m, int[][] rectangularMatrix, int[][] transposedMatrix) {

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = rectangularMatrix[j][i];
            }
        }

        System.out.println("\nTransposed Rectangular Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================================");

    }
}