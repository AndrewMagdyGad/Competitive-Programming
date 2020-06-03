package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF263-D2-A.
 * Problem Name: Beautiful Matrix.
 * Date : 29/09/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF263_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int numberOfMoves = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] == 1) {
                    numberOfMoves = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(numberOfMoves);
    }
}
