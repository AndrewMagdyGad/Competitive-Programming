package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF339-D2-A.
 * Problem Name: Helpful Maths.
 * Date : 14/11/2018.
 * @author Andrew
 */
import java.util.*;

public class CF339_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next().replace("+", "");
        char[] array = s.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + "+");
            else
                System.out.println(array[i]);
        }
    }
}
