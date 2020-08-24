package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF78-D2-B.
 * Problem Name: Easter Eggs.
 * Date : 24/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF78_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] array = {'R', 'O', 'Y', 'G'};
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n - 3; i++)
            answer.append(array[i % 4]);
        answer.append("BIV");
        System.out.println(answer.toString());
    }
}
