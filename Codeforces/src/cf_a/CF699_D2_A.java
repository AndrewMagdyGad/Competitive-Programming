package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF699-D2-A.
 * Problem Name: Launch of Collider.
 * Date : 13/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF699_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String movement = input.next();
        int[] coordinates = new int[n];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < coordinates.length; i++)
            coordinates[i] = input.nextInt();
        for (int i = 0; i < coordinates.length - 1; i++) {
            int temp = (coordinates[i] + coordinates[i + 1]) / 2 - coordinates[i];
            if (movement.charAt(i) == 'R' && movement.charAt(i + 1) == 'L' && temp < answer)
                answer = temp;
        }
        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }
}
