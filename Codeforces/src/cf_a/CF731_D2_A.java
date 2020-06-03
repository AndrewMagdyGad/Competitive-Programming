package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF731-D2-A.
 * Problem Name: Night at the Museum.
 * Date : 07/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF731_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = 'a' + input.next();
        int difference, complement;
        int minimumNumberOfRotations = 0;
        for (int i = 1; i < name.length(); i++) {
            difference = Math.abs(name.charAt(i - 1) - name.charAt(i));
            complement = 26 - difference;
            if (difference < complement)
                minimumNumberOfRotations += difference;
            else
                minimumNumberOfRotations += complement;
        }
        System.out.println(minimumNumberOfRotations);
    }
}
