package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF59-D2-A.
 * Problem Name: Word.
 * Date : 03/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF59_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int numberOfLowercase = 0;
        int numberOfUppercase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                numberOfUppercase++;
            else
                numberOfLowercase++;
        }
        if (numberOfLowercase >= numberOfUppercase)
            System.out.println(s.toLowerCase());
        else
            System.out.println(s.toUpperCase());
    }
}
