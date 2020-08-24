package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF66-D2-B.
 * Problem Name: Petya and Countryside.
 * Date : 22/08/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF66_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = 1;
            int previousLeftIndex = i;
            int previousRightIndex = i;
            int leftIndex = i - 1;
            int rightIndex = i + 1;
            boolean isLeftValid = leftIndex >= 0 && array[leftIndex] <= array[previousLeftIndex];
            boolean isRightValid = rightIndex < n && array[rightIndex] <= array[previousRightIndex];
            while (isLeftValid || isRightValid) {
                if (isLeftValid) {
                    temp++;
                    previousLeftIndex = leftIndex;
                    leftIndex--;
                }
                if (isRightValid) {
                    temp++;
                    previousRightIndex = rightIndex;
                    rightIndex++;
                }
                isLeftValid = leftIndex >= 0 && array[leftIndex] <= array[previousLeftIndex];
                isRightValid = rightIndex < n && array[rightIndex] <= array[previousRightIndex];
            }
            if (temp > max)
                max = temp;
        }
        System.out.println(max);
    }
}
