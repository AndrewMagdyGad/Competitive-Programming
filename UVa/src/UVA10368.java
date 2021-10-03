/**
 * Online Judge: UVa.
 * Problem Code: UVA 10368.
 * Problem Name: Euclid's Game.
 * Date : 07/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10368 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        while (a != 0 || b != 0) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int numberOfTurns = play(a, b);

            if (numberOfTurns % 2 != 0)
                System.out.println("Stan wins");
            else
                System.out.println("Ollie wins");

            a = input.nextInt();
            b = input.nextInt();
        }

    }

    public static int play(int a, int b) {
        if (b == 0)
            return 0;
        if (a / b > 1)
            return 1;
        return play(b, a - b) + 1;
    }
}
