package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: censor
 */
import java.io.*;
import java.util.StringTokenizer;

public class Censoring {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("censor.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        String s = st.nextToken();
        st = new StringTokenizer(reader.readLine());
        String t = st.nextToken();

        StringBuilder sb = new StringBuilder();
        for (char cur : s.toCharArray()) {
            sb.append(cur);

            if (sb.length() >= t.length() && sb.substring(sb.length() - t.length()).equals(t))
                sb.delete(sb.length() - t.length(), sb.length());
        }

        out.println(sb);
        out.close();
    }
}
