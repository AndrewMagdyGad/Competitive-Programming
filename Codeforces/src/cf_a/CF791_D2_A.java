package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF791-D2-A.
 * Problem Name: Bear and Big Brother.
 * Date : 29/09/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF791_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int numberOfYears = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            numberOfYears++;
        }
        System.out.println(numberOfYears);
    }
}
