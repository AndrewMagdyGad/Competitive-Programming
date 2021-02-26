package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: cbarn
 */
import java.io.*;
import java.util.StringTokenizer;

public class CircularBarn {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cbarn.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cbarn.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int distance = 0;
            int counter = 1;
            for (int j = i + 1; j < n; j++) {
                distance += cows[j] * counter++;
            }
            for (int j = 0; j < i; j++) {
                distance += cows[j] * counter++;
            }
            min = Math.min(min, distance);
        }

        out.println(min);
        out.close();
    }
}
