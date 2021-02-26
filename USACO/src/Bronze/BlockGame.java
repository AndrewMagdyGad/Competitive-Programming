package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: blocks
 */
import java.io.*;
import java.util.StringTokenizer;


public class BlockGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int size = 26;
        int[] frequency = new int[size];

        int n = Integer.parseInt(st.nextToken());
        String[][] boards = new String[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            boards[i][0] = st.nextToken();
            boards[i][1] = st.nextToken();
        }

        for (int i = 0; i < n; i++) {
            int[] temp1 = new int[size];
            for (char ch : boards[i][0].toCharArray())
                temp1[ch - 'a']++;

            int[] temp2 = new int[size];
            for (char ch : boards[i][1].toCharArray())
                temp2[ch - 'a']++;

            for (int j = 0; j < size; j++) {
                frequency[j] += Math.max(temp1[j], temp2[j]);
            }
        }

        for (int item : frequency)
            out.println(item);
        out.close();
    }
}
