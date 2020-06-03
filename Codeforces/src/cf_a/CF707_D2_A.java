package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF707-D2-A.
 * Problem Name: Brain's Photos.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF707_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean isColored = false;
        String blackAndWhite = "WGB";
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (!blackAndWhite.contains(input.next())) {
                    isColored = true;
                    break;
                }
        
        System.out.println(isColored ? "#Color" : "#Black&White");
    }
}
