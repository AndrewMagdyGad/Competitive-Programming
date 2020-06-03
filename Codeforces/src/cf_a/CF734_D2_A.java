package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF734-D2-A.
 * Problem Name: Anton and Danik.
 * Date : 29/09/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF734_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        int antonScore = 0;
        int danikScore = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A')
                antonScore++;
            else
                danikScore++;
        }
        if (antonScore > danikScore)
            System.out.println("Anton");
        else if (danikScore > antonScore)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
