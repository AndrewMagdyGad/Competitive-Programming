package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF118-D2-A.
 * Problem Name: String Task.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF118_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vowels = "aoyeui";
        String answer = "";
        String line = input.next().toLowerCase();
        for (int i = 0; i < line.length(); i++)
            if (!vowels.contains(Character.toString(line.charAt(i))))
                answer += Character.toString('.') + line.charAt(i);
        System.out.println(answer);
    }
}
