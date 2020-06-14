package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF296-D2-A.
 * Problem Name: Yaroslav and Permutations.
 * Date : 14/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF296_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int[] frequency = new int[1000];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            frequency[array[i] - 1]++;
            if (frequency[array[i] - 1] > max)
                max = frequency[array[i] - 1];
        }
        System.out.println(2 * max - n <= 1 ? "YES" : "NO");
    }
}
