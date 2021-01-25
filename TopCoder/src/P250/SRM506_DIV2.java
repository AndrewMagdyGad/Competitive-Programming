package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM506-Div2-250.
 * Date : 18/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM506_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] attributes = new int[n];
        for (int i = 0; i < n; i++)
            attributes[i] = input.nextInt();
        System.out.println(train(attributes));
    }

    public static int train(int[] attributes) {
        int max = 0;
        int sum = 0;
        for (int item : attributes)
            if (item > max)
                max = item;

        for (int item : attributes)
            sum += max - item;
        return sum;
    }
}
