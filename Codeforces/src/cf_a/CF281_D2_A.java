package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF281-D2-A.
 * Problem Name: Word Capitalization.
 * Date : 03/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF281_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        if (Character.isLowerCase(word.charAt(0)))
            System.out.println((char)(word.charAt(0) - 'a' + 'A') + word.substring(1));
        else
            System.out.println(word);
    }
}
