package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: blist
 */
import java.io.*;
import java.util.StringTokenizer;

public class TheBucketList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("blist.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] time = new int[1001];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int buckets = Integer.parseInt(st.nextToken());
            for (int j = start; j <= end; j++) {
                time[j] += buckets;
                if (time[j] > max)
                    max = time[j];
            }
        }

        out.println(max);
        out.close();
    }
}
