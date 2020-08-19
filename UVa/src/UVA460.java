/**
 * Online Judge: UVa.
 * Problem Code: UVA 460.
 * Problem Name: Overlapping Rectangles.
 * Date : 05/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA460 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            input.nextLine();
            int x11 = input.nextInt();
            int y11 = input.nextInt();
            int x12 = input.nextInt();
            int y12 = input.nextInt();
            int x21 = input.nextInt();
            int y21 = input.nextInt();
            int x22 = input.nextInt();
            int y22 = input.nextInt();

            int xLower = Math.max(x11, x21);
            int yLower = Math.max(y11, y21);
            int xUpper = Math.min(x12, x22);
            int yUpper = Math.min(y12, y22);

            if (xLower < xUpper && yLower < yUpper)
                System.out.println(xLower + " " + yLower + " " + xUpper + " " + yUpper);
            else
                System.out.println("No Overlap");

            if (i != t - 1)
                System.out.println();
        }
    }
}
