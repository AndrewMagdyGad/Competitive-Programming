package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF431-D2-A.
 * Problem Name: Black Square.
 * Date : 04/10/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF431_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNumberOfCalories = 0;
        int[] calories = new int[4];
        for (int i = 0; i < calories.length; i++)
            calories[i] = input.nextInt();
        String s = input.next();
        for (int i = 0; i < s.length(); i++) {
            totalNumberOfCalories += calories[s.charAt(i) - '1'];
        }
        System.out.println(totalNumberOfCalories);
    }
}
