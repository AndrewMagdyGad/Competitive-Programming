package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF680-D2-B.
 * Problem Name: Bear and Finding Criminals.
 * Date : 22/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF680_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        int numberOfCriminals = array[a - 1];
        int leftIndex = a - 2;
        int rightIndex = a;
        while (leftIndex >= 0 || rightIndex < n) {
            if (leftIndex >= 0 && rightIndex < n) {
                numberOfCriminals += (array[leftIndex] & array[rightIndex]) == 1 ? 2 : 0;
                leftIndex--;
                rightIndex++;
            }
            else if (leftIndex >= 0) {
                numberOfCriminals += array[leftIndex];
                leftIndex--;
            }
            else {
                numberOfCriminals += array[rightIndex];
                rightIndex++;
            }
        }
        System.out.println(numberOfCriminals);
    }
}
