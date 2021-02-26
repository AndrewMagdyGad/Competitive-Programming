package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: measurement
 */
import java.io.*;
import java.util.StringTokenizer;

public class MilkMeasurement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("measurement.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] logs = new int[100][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            int day = Integer.parseInt(st.nextToken());
            String cowName = st.nextToken();
            String delta = st.nextToken();
            char sign = delta.charAt(0);
            int number = Integer.parseInt(delta.substring(1));
            switch (cowName) {
                case "Bessie":
                    logs[day - 1][0] = sign == '+' ? number : -1 * number;
                    break;
                case "Elsie":
                    logs[day - 1][1] = sign == '+' ? number : -1 * number;
                    break;
                case "Mildred":
                    logs[day - 1][2] = sign == '+' ? number : -1 * number;
                    break;
            }
        }

        int BessieCount = 7, ElsieCount = 7, MildredCount = 7;
        int answer = 0;
        int sumOfMax = 7;

        for (int i = 0; i < 100; i++) {
            BessieCount += logs[i][0];
            ElsieCount += logs[i][1];
            MildredCount += logs[i][2];

            int tempSum = 0;
            int max = Math.max(Math.max(BessieCount, ElsieCount), MildredCount);
            if (BessieCount == max)
                tempSum += 1;
            if (ElsieCount == max)
                tempSum += 2;
            if (MildredCount == max)
                tempSum += 4;

            if (tempSum != sumOfMax) {
                answer++;
                sumOfMax = tempSum;
            }
        }


        out.println(answer);
        out.close();
    }
}
