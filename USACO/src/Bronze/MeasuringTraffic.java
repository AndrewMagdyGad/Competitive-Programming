package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: traffic
 */
import java.io.*;
import java.util.StringTokenizer;

public class MeasuringTraffic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("traffic.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("traffic.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] status = new String[n];
        int[][] sensors = new int[n][2];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(reader.readLine());
            status[i] = String.valueOf(st.nextToken());
            sensors[i][0] = Integer.parseInt(st.nextToken());
            sensors[i][1] = Integer.parseInt(st.nextToken());
        }

        int lower = -999999999;
        int upper = 999999999;
        for (int i = n - 1; i >= 0; i--) {
            switch (status[i]) {
                case "on":
                    lower -= sensors[i][1];
                    upper -= sensors[i][0];
                    lower = Math.max(0, lower);
                    break;
                case "off":
                    lower += sensors[i][0];
                    upper += sensors[i][1];
                    break;
                case "none":
                    lower = Math.max(sensors[i][0], lower);
                    upper = Math.min(sensors[i][1], upper);
            }
        }
        out.println(lower + " " + upper);

        lower = -999999999;
        upper = 999999999;
        for (int i = 0; i < n; i++) {
            switch (status[i]) {
                case "on":
                    lower += sensors[i][0];
                    upper += sensors[i][1];
                    break;
                case "off":
                    lower -= sensors[i][1];
                    upper -= sensors[i][0];
                    lower = Math.max(0, lower);
                    break;
                case "none":
                        lower = Math.max(sensors[i][0], lower);
                        upper = Math.min(sensors[i][1], upper);
            }
        }
        out.println(lower + " " + upper);
        out.close();
    }
}
