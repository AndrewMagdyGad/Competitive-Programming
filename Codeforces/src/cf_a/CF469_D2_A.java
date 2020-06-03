package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF469-D2-A.
 * Problem Name: I Wanna Be the Guy.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF469_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPassed = true;
        int n = input.nextInt();
        boolean[] array = new boolean[n];
        int p = input.nextInt();
        for (int i = 0; i < p; i++)
            array[input.nextInt() - 1] = true;
        int q = input.nextInt();
        for (int i = 0; i < q; i++)
            array[input.nextInt() - 1] = true;
        for (int i = 0; i < array.length; i++)
            if (!array[i]) {
                isPassed = false;
                break;
            }
        
        if (isPassed)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
