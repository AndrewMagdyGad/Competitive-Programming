package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF463-D2-B.
 * Problem Name: Caisa and Pylons.
 * Date : 22/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF463_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        int energy = 0;
        int previousPylon = 0;
        int minimumNumberOfDollars = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > previousPylon + energy) {
                minimumNumberOfDollars += array[i] - (previousPylon + energy);
                energy = 0;
            }
            else
                energy += previousPylon - array[i];
            previousPylon = array[i];
        }
        System.out.println(minimumNumberOfDollars);
    }
}
