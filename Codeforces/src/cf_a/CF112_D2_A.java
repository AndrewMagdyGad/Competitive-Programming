package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF112-D2-A.
 * Problem Name: Petya and Strings.
 * Date : 01/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF112_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        int answer = 0;
        for (int i =0; i < string1.length(); i++) {
            if (string1.charAt(i) > string2.charAt(i)) {
                answer = 1;
                break;
            }
            else if (string2.charAt(i) > string1.charAt(i)) {
               answer = -1;
               break; 
            }       
        }
        System.out.println(answer);   
    }
}
