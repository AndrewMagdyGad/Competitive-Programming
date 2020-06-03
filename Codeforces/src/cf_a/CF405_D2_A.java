package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF405-D2-A.
 * Problem Name: Gravity Flip.
 * Date : 01/10/2018.
 * @author Andrew
 */
import java.util.Scanner;
import java.util.Arrays;

public class CF405_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        Arrays.sort(array);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
