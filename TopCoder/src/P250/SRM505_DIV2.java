package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM505-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM505_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String paragraph = input.nextLine();
        System.out.println(fixCaps(paragraph));
    }

    public static String fixCaps(String paragraph) {
        StringBuilder answer = new StringBuilder();
        boolean dotCheck = false;
        for (int i = 0; i < paragraph.length(); i++) {
            if (i == 0) {
                answer.append(Character.toUpperCase(paragraph.charAt(i)));
            }
            else {
                if (paragraph.charAt(i) == '.')
                    dotCheck = true;
                else if (dotCheck && Character.isAlphabetic(paragraph.charAt(i))) {
                    answer.append(Character.toUpperCase(paragraph.charAt(i)));
                    dotCheck = false;
                    continue;
                }
                answer.append(paragraph.charAt(i));
            }
        }
        return answer.toString();
    }
}
