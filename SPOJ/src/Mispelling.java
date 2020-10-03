/**
 * Online Judge: SPOJ.
 * Problem Code: GNY07A.
 * Problem Name: Mispelling.
 * Date : 08/09/2020.
 * @author Andrew
 */
import java.io.*;

public class Mispelling {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            String line = reader.readLine();
            int m = Integer.parseInt(line.split(" ")[0]);
            String word = line.split(" ")[1];
            out.print((i + 1) + " ");
            for (int j = 0; j < word.length(); j++)
                if (j != m - 1)
                    out.print(word.charAt(j));
            out.println();
            out.flush();
        }
    }
}
