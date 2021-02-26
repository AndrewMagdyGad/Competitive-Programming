package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: mixmilk
 */
import java.io.*;
import java.util.StringTokenizer;

public class MixingMilk {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
        StringTokenizer st;

        int n = 3;
        int[] capacity = new int[n];
        int[] buckets = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            capacity[i] = Integer.parseInt(st.nextToken());
            buckets[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 100; i++) {
            int operation = i % n;
            int addedBucket = (operation + 1) % n;
            int toBeAdded = Math.min(capacity[addedBucket] - buckets[addedBucket], buckets[operation]);
            buckets[operation] -= toBeAdded;
            buckets[addedBucket] += toBeAdded;
        }

        for (int bucket: buckets)
            out.println(bucket);
        out.close();
    }
}
