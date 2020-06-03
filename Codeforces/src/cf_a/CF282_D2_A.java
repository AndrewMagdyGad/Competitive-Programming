package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF282-D2-A.
 * Problem Name: Bit++.
 * Date : 22/02/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF282_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        String statement;
        for (int i = 0; i < n ; i++) {
            statement = input.next();
            if (statement.contains("+"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
