package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF443-D2-A.
 * Problem Name: Anton and Letters.
 * Date : 13/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF443_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String set = input.nextLine();
        String distinct = "";
        for (int i = 1; i < set.length() - 1; i++) {
            if (set.charAt(i) != ',' && set.charAt(i) != ' ') {
                if (!distinct.contains(set.charAt(i) + ""))
                    distinct += set.charAt(i);
            }
        }
        System.out.println(distinct.length());
    }
}
