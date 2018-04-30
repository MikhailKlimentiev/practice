package tasks.matrix.transpose;

import java.util.Scanner;

/**
 * RectangularMatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 2.0
 * @since 04/30/2018
 */
public class RectangularMatrixTransposition {

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

    public int[][] createTransposedMatrix(int n, int m) {
        int[][] transposedRectangularMatrix = new int[m][];

        for (int i = 0; i < transposedRectangularMatrix.length; i++) {
            transposedRectangularMatrix[i] = new int[n];
        }
        return transposedRectangularMatrix;
    }

    public void transposeAndPrintRectangularMatrix(int n, int m, int[][] rectangularMatrix, int[][] transposedMatrix ) {

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