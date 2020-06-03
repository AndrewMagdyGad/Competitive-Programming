package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF474-D2-A.
 * Problem Name: Keyboard.
 * Date : 23/02/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF474_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String direction = input.next();
        String message = input.next();
        String originalMessage = "";
        int count = direction.equals("R") ? -1 : 1;
        for (int i = 0; i < message.length(); i++) {
            int index = keyboard.indexOf(message.charAt(i));
            originalMessage += keyboard.charAt(index + count);
        }
        System.out.println(originalMessage);
    }
}
