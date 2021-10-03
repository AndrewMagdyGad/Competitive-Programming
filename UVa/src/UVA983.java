/**
 * Online Judge: UVa.
 * Problem Code: UVA 983.
 * Problem Name: Localized Summing for Blurring.
 * Date : 13/03/2021.
 * @author Andrew
 */
import java.util.StringTokenizer;
import java.io.*;

public class UVA983 {
    public static void main(String[] args) throws IOException  {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;
        boolean firstTestCase = true;

        while ((line = bufferReader.readLine()) != null) {
            if (!firstTestCase)
                line = bufferReader.readLine();

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long[][] numbers = new long[n + 1][n + 1];
            for (int i = n; i > 0; i--) {
                for (int j = 1; j <= n; j++) {
                    numbers[i][j] = Integer.parseInt(bufferReader.readLine());
                }
            }

            // accumulate eah row
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    numbers[i][j] += numbers[i][j - 1];
                }
            }

            // accumulate eah column
            for (int j = 1; j <= n; j++) {
                for (int i = 1; i <= n; i++)
                    numbers[i][j] += numbers[i - 1][j];
            }

            if (!firstTestCase)
                out.println();
            else
                firstTestCase = false;

            long total = 0;
            for (int i = n; i >= m; i--) {
                for (int j = 1; j <= n - m + 1; j++) {
                    // top left corner
                    int a = i - m + 1;
                    int b = j;

                    // bottom right corner
                    int c = i;
                    int d = j + m - 1;

                    long sum = getSum(numbers, a, b, c, d);
                    total += sum;
                    out.println(sum);
                }
            }
            out.println(total);
            out.flush();
        }
    }

    public static long getSum(long[][] numbers, int a, int b, int c, int d) {
        return numbers[c][d] - numbers[a - 1][d] - numbers[c][b - 1] + numbers[a - 1][b - 1];
    }
}
