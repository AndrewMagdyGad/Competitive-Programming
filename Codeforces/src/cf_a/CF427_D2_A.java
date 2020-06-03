package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF427-D2-A.
 * Problem Name: Police Recruits.
 * Date : 04/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF427_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberOfOfficers = 0;
        int untreatedCrimes = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = input.nextInt();
            if (temp < 0 && numberOfOfficers == 0)
                untreatedCrimes++;
            else
                numberOfOfficers += temp;
        }
        System.out.println(untreatedCrimes);
    }
}
