package tasks.matrix.transpose;

import java.util.Scanner;

/**
 * MatrixTransposition.
 *
 * @author Mikhail Klimentyev
 * @version 1.0
 * @since 04/30/201s
 */
public abstract class MatrixTransposition {

    public abstract int[][] getSizeAndInitializeMatrix(Scanner scan);

    public abstract void transposeMatrix(int[][] matrix);

}
