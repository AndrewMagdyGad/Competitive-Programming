package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF231-D2-A.
 * Problem Name: Team.
 * Date : 29/09/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF231_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberOfProblems = 0;
        int petya, vasya, tonya;
        for (int i = 0; i < n; i++) {
            petya = input.nextInt();
            vasya = input.nextInt();
            tonya = input.nextInt();
            if ((petya + vasya + tonya) > 1)
                numberOfProblems++;
        }
        System.out.println(numberOfProblems);
    }
}
