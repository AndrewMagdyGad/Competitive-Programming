/**
 * Online Judge: SPOJ.
 * Problem Code: HELLOKIT.
 * Problem Name: Hello Kitty.
 * Date : 13/09/2020.
 * @author Andrew
 */
import java.io.*;

public class HelloKitty {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = reader.readLine();
        while (!line.equals(".")) {
            String word = line.split(" ")[0];
            int number = Integer.valueOf(line.split(" ")[1]);
            StringBuilder pattern = new StringBuilder(word);
            for (int i = 1; i < number; i++)
                pattern.append(word);
            for (int i = 0; i < word.length(); i++) {
                for (int j = i; j < pattern.length(); j++)
                    out.print(pattern.charAt(j));
                for (int j = 0; j < i; j++)
                    out.print(pattern.charAt(j));
                out.println();
                out.flush();
            }
            line = reader.readLine();
        }
    }
}
