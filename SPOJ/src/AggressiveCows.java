/**
 * Online Judge: SPOJ.
 * Problem Name: Aggressive cows.
 * Date : 17/07/2020.
 * @author Andrew
 */
import java.util.*;
import java.io.*;

public class AggressiveCows {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;
        String[] inputs;
        line = reader.readLine();
        inputs = line.split(" ");
        int t = Integer.parseInt(inputs[0]);
        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            inputs = line.split(" ");
            int n = Integer.parseInt(inputs[0]);
            int c = Integer.parseInt(inputs[1]);
            int[] array = new int[n];
            for (int j = 0; j < n; j++)
                array[j] = Integer.parseInt(reader.readLine());
            System.out.println(largestMinimumDistance(array, c));
        }
    }

    public static int largestMinimumDistance(int[] array, int c) {
        Arrays.sort(array);
        int low = array[1] - array[0];
        int high = array[array.length - 1] - array[0];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int requiredCows = 1;
            int start = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] - start > mid) {
                    start = array[i];
                    requiredCows++;
                }
            }

            if (requiredCows < c)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
