package tasks.matrix.transpose;

/**
 * RectangularMatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 04/29/2018
 */
public class RectangularMatrixTransposition {

    public void getRectangularMatrixSize(scan){

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
}