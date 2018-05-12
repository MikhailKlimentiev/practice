//=================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////                                                                                                           ////
////    Turn a matrix on 90 degrees clockwise (Повернуть матрицу на 90 градусов по часовой стрелке)            ////
////                                                                                                           ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//=================================================================================================================

package tasks.matrix.rotation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * MatrixRotationRunner.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 05/01/2018
 */
public class MatrixRotationRunner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int height = 0;
        int width = 0;
        boolean firstCondition = true;
        boolean secondCondition = true;

        // get height from console
        while (firstCondition) {
            try {
                System.out.print("Please input height of Matrix: ");
                height = scan.nextInt();
                firstCondition = false;
            } catch (InputMismatchException ime) {
                System.err.println("You entered not a number. Please try again.");
                scan.next();
            }
        }

        // get width from console
        while (secondCondition) {
            try {
                System.out.print("Please input width of Matrix: ");
                width = scan.nextInt();
                secondCondition = false;
            } catch (InputMismatchException ime) {
                System.err.println("You entered not a number. Please try again.");
                scan.next();
            }
        }

        // create initial matrix
        int[][] matrix = new int[height][width];

        // initialize initial matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 100);
            }
        }

        // print initial matrix in console
        System.out.println("Initial Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // create rotated matrix
        int[][] rotatedMatrix = new int[width][height];

        // rotate initial matrix
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }

        // print rotated matrix in console
        System.out.println("\nRotated Matrix: ");
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
