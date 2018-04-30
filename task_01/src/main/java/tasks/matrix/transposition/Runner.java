//=================================================================================================================
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////                                                                                                           ////
////    Transpose a matrix (Транспонировать матрицу)                                                           ////
////                                                                                                           ////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//=================================================================================================================

package tasks.matrix.transposition;

import java.util.Scanner;

/**
 * Runner.
 *
 * @author Mikhail Klimentyev
 * @version 2.0
 * @since 04/30/2018
 */
public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // ========================= Square Matrix Transposition =====================================================
        SquareMatrixTransposition squareMatrixTransposition = new SquareMatrixTransposition();
        squareMatrixTransposition.transposeMatrix(squareMatrixTransposition.getSizeAndCreateAndInitializeMatrix(scan));

        // ========================= Rectangular Matrix Transposition ================================================
        RectangularMatrixTransposition rectangularMatrixTransposition = new RectangularMatrixTransposition();
        int n = rectangularMatrixTransposition.getHeightMatrix(scan);
        int m = rectangularMatrixTransposition.getWidthMatrix(scan);
        int[][] rectangularMatrix = rectangularMatrixTransposition.createAndInitializeAndPrintInitialMatrix(n, m);
        int[][] transposedRectangularMatrix = rectangularMatrixTransposition.createTransposedMatrix(n, m);
        rectangularMatrixTransposition.transposeAndPrintRectangularMatrix(n, m, rectangularMatrix, transposedRectangularMatrix);
    }
}