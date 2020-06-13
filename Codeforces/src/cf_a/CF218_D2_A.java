package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF218-D2-A.
 * Problem Name: Mountain Scenery.
 * Date : 13/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF218_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[2 * n + 1];
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && k > 0 && isValid(array, i)) {
                System.out.print(array[i] - 1 + " ");
                k--;
            }
            else
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isValid(int[] array, int i) {
        return (array[i] - array[i - 1] > 1) && (array[i] - array[i + 1] > 1);
    }
}
