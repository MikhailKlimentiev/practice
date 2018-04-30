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


    public int getSizeMatrix(Scanner scan) {
        boolean condition = true;
        int n = 0;
        int m = 0;

        while (condition) {
            System.out.println("Please enter count of Rectangular Matrix's rows: ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                condition = false;
            } else {
                System.err.println("You inputted not a number. Please try again.");
                scan.next();
            }
        }

        while (condition) {
            System.out.println("Please enter count of Rectangular Matrix's columns: ");
            if (scan.hasNextInt()) {
                m = scan.nextInt();
                condition = false;
            } else {
                System.err.println("You inputted not a number. Please try again.");
                scan.next();
            }
        }

        int[][] rectangularMatrix = new int[n][];
        int[][] transposedRectangularMatrix = new int[m][];

        for (int i = 0; i < rectangularMatrix.length; i++) {
            rectangularMatrix[i] = new int[m];
        }

        for (int i = 0; i < transposedRectangularMatrix.length; i++) {
            rectangularMatrix[i] = new int[n];
        }

        for (int i = 0; i < rectangularMatrix.length; i++) {
            for (int j = 0; j < rectangularMatrix[i].length; j++) {
                rectangularMatrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        }

        return rectangularMatrix;

    }


    public int[][] getSizeOfTransposedRectangularMatrix(int[][] rectangularMatrix){
        int n;
        int m;
        n = rectangularMatrix.length;
    }












    public void rectangularMatrixTransposition() {
        int n = 2;
        int m = 4;

        int[][] matrix = new int[n][];
        int[][] transposedMatrix = new int[m][];

        for (int i = 0; i < transposedMatrix.length; i++) {
            transposedMatrix[i] = new int[n];
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[m];


            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        }

        System.out.println("Initial Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }


    @Override
    public void transposeMatrix(int[][] matrix) {

    }
}