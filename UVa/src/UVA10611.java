/**
 * Online Judge: UVa.
 * Problem Code: UVA 10611.
 * Problem Name: The Playboy Chimp.
 * Date : 09/07/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10611 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        int q = input.nextInt();
        int[] queryArray = new int[q];
        for (int i = 0; i < q; i++)
            queryArray[i] = input.nextInt();

        for (int i = 0; i < q; i++) {
            int firstIndex = findFirst(array, queryArray[i]);
            int lastIndex = findLast(array, queryArray[i]);
            if (array[firstIndex] >= queryArray[i])
                firstIndex--;
            if (array[lastIndex] <= queryArray[i])
                lastIndex++;
            System.out.println((firstIndex >= 0 ? array[firstIndex] : "X") + " " + (lastIndex < array.length ? array[lastIndex] : "X"));
        }
    }

    public static int findFirst(int[] array, int num) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < num)
                start = mid + 1;
            else if (array[mid] > num)
                end = mid - 1;
            else
                end = mid;
        }
        return start;
    }

    public static int findLast(int[] array, int num) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start + 1) / 2;
            if (array[mid] < num)
                start = mid + 1;
            else if (array[mid] > num)
                end = mid - 1;
            else
                start = mid;
        }
        return start;
    }
}
