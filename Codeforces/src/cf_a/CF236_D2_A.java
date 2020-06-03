package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF236-D2-A.
 * Problem Name: Boy or Girl.
 * Date : 01/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF236_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.next();
        String distinct = "";
        for (int i = 0; i < username.length(); i++) {
            if (!distinct.contains(String.valueOf(username.charAt(i))))
                distinct += username.charAt(i);
        }
        if (distinct.length() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
