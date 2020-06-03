package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF677-D2-A.
 * Problem Name: Vanya and Fence.
 * Date : 24/09/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF677_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int answer = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
            if (array[i] > h)
                answer += 2;
            else
                answer++;
        }
        System.out.println(answer);
    }
}
