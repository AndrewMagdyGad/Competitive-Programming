package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: cowsignal
 */
import java.io.*;
import java.util.StringTokenizer;

public class TheCowSignal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String[] arr = new String[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i] = st.nextToken();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                char current = arr[i].charAt(j);
                for (int a = 0; a < k; a++)
                    temp.append(current);
            }

            for (int a = 0; a < k; a++) {
                sb.append(temp);
                sb.append('\n');
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        out.println(sb);
        out.close();
    }
}
