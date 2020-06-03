package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF268-D2-A.
 * Problem Name: Games.
 * Date : 07/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF268_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] teams = new int[n][2];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            teams[i][0] = input.nextInt();
            teams[i][1] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (teams[i][0] == teams[j][1])
                    answer++;
            }
        }
        System.out.println(answer);
    }
}
