package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF287-D2-A.
 * Problem Name: IQ Test.
 * Date : 14/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF287_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[4];
        for (int i = 0; i < array.length; i++)
            array[i] = input.next();
        String answer = "NO";
        for (int i = 0; i < array.length - 1 && !answer.equals("YES"); i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int black = 0, white = 0;
                if (array[i].charAt(j) == '#')
                    black++;
                else
                    white++;

                if (array[i].charAt(j + 1) == '#')
                    black++;
                else
                    white++;

                if (array[i + 1].charAt(j) == '#')
                    black++;
                else
                    white++;

                if (array[i + 1].charAt(j + 1) == '#')
                    black++;
                else
                    white++;

                if (black >= 3 || white >= 3) {
                    answer = "YES";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
