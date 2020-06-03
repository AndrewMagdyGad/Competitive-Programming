package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF43-D2-A.
 * Problem Name: Football.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF43_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scoreOfFirstTeam = 1, scoreOfSecondTeam = 0;
        int n = input.nextInt();
        String firstTeam = input.next();
        String secondTeam = "", temp;
        for (int i = 1; i < n; i++) {
            temp = input.next();
            if (firstTeam.equals(temp))
                scoreOfFirstTeam++;
            else {
                secondTeam = temp;
                scoreOfSecondTeam++;
            }
        }
        System.out.println((scoreOfFirstTeam > scoreOfSecondTeam) ? firstTeam : secondTeam);
    }
}
