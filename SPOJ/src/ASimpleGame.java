/**
 * Online Judge: SPOJ.
 * Problem Code: NOVICE51.
 * Problem Name: A Simple Game.
 * Date : 07/09/2020.
 * @author Andrew
 */
import java.io.*;

public class ASimpleGame {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            int n = Integer.parseInt(line);
            boolean isFirstPlayer = false;
            while (n > 0) {
                if (n % 2 == 0)
                    n /= 2;
                else
                    n -= 1;
                isFirstPlayer = !isFirstPlayer;
            }
            if (isFirstPlayer)
                out.println("Aayush");
            else
                out.println("Akash");
            out.flush();
        }
    }
}
