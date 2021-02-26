package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: shuffle
 */
import java.io.*;
import java.util.StringTokenizer;

public class TheBovineShuffle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("shuffle.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] shuffle = new int[n];
        int[] previousOrder = new int[n];
        int[] order = new int[n];
        int[] finalOrder = new int[n];
        int[] ans = new int[n];
        int size = 3;

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            shuffle[i] = Integer.parseInt(st.nextToken());
            previousOrder[i] = i;
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++)
            finalOrder[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n; j++) {
                int index = shuffle[j] - 1;
                order[index] = previousOrder[j];
            }

            for (int j = 0; j < n; j++)
                previousOrder[j] = order[j];
        }

        for (int i = 0; i < n; i++) {
            int index = order[i];
            ans[index] = i;
        }

        for (int item : ans)
            out.println(finalOrder[item]);
        out.close();
    }
}
