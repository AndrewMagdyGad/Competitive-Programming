/**
 * Online Judge: SPOJ.
 * Problem Code: BITCNTR.
 * Problem Name: Bit counts.
 * Date : 09/09/2020.
 * @author Andrew
 */
import java.io.*;

public class BitCounts {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            int number = Integer.parseInt(reader.readLine());
            int sum = 0;
            while (number > 0) {
                sum += number & 1;
                number >>>= 1;
            }
            out.println(sum);
            out.flush();
        }
    }
}
