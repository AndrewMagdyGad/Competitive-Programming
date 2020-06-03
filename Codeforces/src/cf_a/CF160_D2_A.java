package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF160-D2-A.
 * Problem Name: Twins.
 * Date : 23/02/2020.
 * @author Andrew
 */
import java.util.*;

public class CF160_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int minimumNumberOfCoins = n;
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        Arrays.sort(array);
        for (int i = 1; i < n; i++)
            array[i] += array[i - 1];
        for (int i = array.length - 2; i >= 0; i--)
            if (array[array.length - 1] - array[i] > array[i]) {
                minimumNumberOfCoins = array.length - 1 - i;
                break;
            }
        System.out.println(minimumNumberOfCoins);
    }
}
