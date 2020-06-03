package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF208-D2-A.
 * Problem Name: Dubstep.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF208_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.next();
        String answer = "";
        String temp;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'W' && i + 2 < line.length()) {
                temp = Character.toString(line.charAt(i)) + line.charAt(i + 1) + line.charAt(i + 2);
                if (temp.equals("WUB")) {
                    if (answer.length() > 0 && answer.charAt(answer.length() - 1) != ' ')
                        answer += " ";
                    i += 2;
                }
                else
                    answer += line.charAt(i);
            }
            else
                answer += line.charAt(i);
        }
        System.out.println(answer);
    }
}
