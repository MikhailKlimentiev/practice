/**
 * Runner.
 *
 * @author Mikhail Klimentsyeu
 * @version 1.0
 * @since 5/6/2018
 */

package tasks.matrix.multiplication;

public class Runner {
    public static void main(String[] args) {
        int[][] firstMatrix = new int[m][n];
        int[][] secondMatrix = new int[n][q];
        int[][] multipliedMatrix = new int[m][q];

        System.out.println("First matrix: ");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond matrix: ");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                secondMatrix[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMultiplied matrix: ");
        for (int i = 0; i < multipliedMatrix.length; i++) {
            for (int j = 0; j < multipliedMatrix[i].length; j++) {
                multipliedMatrix[i][j] = 0;
                for (int k = 0; k < firstMatrix[i].length; k++) {
                    multipliedMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
                System.out.print(multipliedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
