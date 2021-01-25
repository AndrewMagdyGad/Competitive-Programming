package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM504-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM504_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] A = new int[a];
        for (int i = 0; i < a; i++)
            A[i] = input.nextInt();
        int b = input.nextInt();
        int[] B = new int[b];
        for (int i = 0; i < b; i++)
            B[i] = input.nextInt();
        int w = input.nextInt();
        int[] wanted = new int[w];
        for (int i = 0; i < w; i++)
            wanted[i] = input.nextInt();
        System.out.println(makeProgram(A, B, wanted));
    }

    public static int makeProgram(int[] A, int[] B, int[] wanted) {
        boolean[] candidatePrograms = {true, true, true, true};
        for (int i = 0; i < A.length; i++) {
            if (wanted[i] != A[i])
                candidatePrograms[0] = false;
            if (wanted[i] != B[i])
                candidatePrograms[1] = false;
            if ((A[i] < B[i] && wanted[i] != A[i]) || (A[i] >= B[i] && wanted[i] != B[i]))
                candidatePrograms[2] = false;
            if ((A[i] < B[i] && wanted[i] != B[i]) || (A[i] >= B[i] && wanted[i] != A[i]))
                candidatePrograms[3] = false;
        }

        for (int i = 0; i < candidatePrograms.length; i++)
            if (candidatePrograms[i]) {
                return (i < 2) ? 1 : 7;
            }

        return -1;
    }
}
