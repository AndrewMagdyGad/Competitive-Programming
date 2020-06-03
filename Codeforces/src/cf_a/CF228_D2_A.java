package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF228-D2-A.
 * Problem Name: Is your horseshoe on the other hoof?.
 * Date : 07/10/2018.
 * @author Andrew
 */
import java.util.*;

public class CF228_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        List<Integer> distinct = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (!distinct.contains(array[i]))
                distinct.add(array[i]);
        }
        System.out.println(4 - distinct.size());
    }
}
