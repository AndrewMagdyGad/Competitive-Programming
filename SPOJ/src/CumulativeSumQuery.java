/**
 * Online Judge: SPOJ.
 * Problem Code: CSUMQ.
 * Problem Name: Cumulative Sum Query.
 * Date : 13/03/2021.
 * @author Andrew
 */
import java.io.*;

public class CumulativeSumQuery {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n + 1];
        String line = reader.readLine();
        String[] inputs = line.split(" ");
        for (int i = 1; i <= n; i++)
            numbers[i] = Integer.parseInt(inputs[i - 1]) + numbers[i - 1];

        int m = Integer.parseInt(reader.readLine());
        for (int a = 0; a < m; a++) {
            line = reader.readLine();
            inputs = line.split(" ");
            int i = Integer.parseInt(inputs[0]);
            int j = Integer.parseInt(inputs[1]);
            out.println(numbers[j + 1] - numbers[i]);
        }
        out.flush();
    }
}
