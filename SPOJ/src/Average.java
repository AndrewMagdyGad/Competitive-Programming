/**
 * Online Judge: SPOJ.
 * Problem Code: AVG.
 * Problem Name: AVERAGE.
 * Date : 08/09/2020.
 * @author Andrew
 */
import java.io.*;

public class Average {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            reader.readLine();
            String[] numbers = reader.readLine().split(" ");
            long sum = 0;
            for (int j = 0; j < numbers.length; j++)
                sum += Long.parseLong(numbers[j]);
            out.println(sum / numbers.length);
            out.flush();
        }
    }
}
