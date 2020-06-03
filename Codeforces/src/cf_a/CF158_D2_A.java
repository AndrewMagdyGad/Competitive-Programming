package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF158-D2-A.
 * Problem Name: Next Round.
 * Date : 22/02/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF158_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int numberOfParticipants = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            if (i <= k - 1 && array[i] > 0)
                numberOfParticipants++;
            else if (i > k - 1 && array[i] > 0 && array[i] >= array[k - 1])
                numberOfParticipants++;
        }
        System.out.println(numberOfParticipants);
    }
}
