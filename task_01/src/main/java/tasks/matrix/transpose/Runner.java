package tasks.matrix.transpose;

import java.util.Scanner;

/**
 * Runner.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 04/29/2018
 */
public class Runner {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
//        Runner run = new Runner();
//        run.transposeMatrix(matrix);
//        RectangularMatrixTransposition rectangularMatrixTransposition = new RectangularMatrixTransposition();
//        rectangularMatrixTransposition.RectangularMatrixTransposition();
        Scanner scan = new Scanner(System.in);
        SquareMatrixTransposition squareMatrixTransposition = new SquareMatrixTransposition();
        squareMatrixTransposition.transposeMatrix(squareMatrixTransposition.getSizeAndInitializeMatrix(scan));


    }


}