package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF768-D2-A.
 * Problem Name: Oath of the Night's Watch.
 * Date : 18/01/2020.
 * @author Andrew
 */
import java.util.*;

public class CF768_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) 
            array[i] = input.nextInt();
        Arrays.sort(array);
        for (int i = 1; i < n - 1; i++)
            if (array[i] > array[0] && array[i] < array[n - 1])
                answer++;
        System.out.println(answer);
    }
}
