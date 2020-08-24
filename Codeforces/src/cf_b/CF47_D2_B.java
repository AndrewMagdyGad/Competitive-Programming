package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF47-D2-B.
 * Problem Name: Coins.
 * Date : 24/08/2020.
 * @author Andrew
 */
import java.util.Arrays;
import java.util.Scanner;

public class CF47_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aCounter = 0, bCounter = 0, cCounter = 0;
        for (int i = 0; i < 3; i++) {
            String str = input.next();
            if (str.contains("A>") || str.contains("<A"))
                aCounter++;
            else if (str.contains("B>") || str.contains("<B"))
                bCounter++;
            else
                cCounter++;
        }
        String check = String.valueOf(aCounter) + String.valueOf(bCounter) + String.valueOf(cCounter);
        if (check.contains("0") && check.contains("1") && check.contains("2")) {
            int[] array = {aCounter, bCounter, cCounter};
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == aCounter)
                    System.out.print("A");
                else if (array[i] == bCounter)
                    System.out.print("B");
                else
                    System.out.print("C");
            }
            System.out.println();
        }
        else
            System.out.println("Impossible");
    }
}
