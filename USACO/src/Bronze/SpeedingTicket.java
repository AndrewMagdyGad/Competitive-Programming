package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: speeding
 */
import java.io.*;
import java.util.StringTokenizer;


public class SpeedingTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] road = new int[n][2];
        int[][] bessie = new int[m][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            road[i][0] = Integer.parseInt(st.nextToken());
            road[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            bessie[i][0] = Integer.parseInt(st.nextToken());
            bessie[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int roadIndex = 0;
        int amount = road[roadIndex][0];

        for (int i = 0; i < m; i++) {
            amount -= bessie[i][0];
            max = Math.max(max, bessie[i][1] - road[roadIndex][1]);

            while (amount < 0) {
                roadIndex++;
                amount += road[roadIndex][0];
                max = Math.max(max, bessie[i][1] - road[roadIndex][1]);
            }

            if (amount == 0 && roadIndex < n - 1) {
                roadIndex++;
                amount += road[roadIndex][0];
            }
        }

        out.println(max);
        out.close();
    }
}
