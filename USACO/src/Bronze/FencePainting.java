package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: paint
 */
import java.io.*;
import java.util.StringTokenizer;

public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("paint.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int count = (b - a )+ (d - c);
        int intersection = Math.max((Math.min(b, d) - Math.max(a, c)), 0);
        out.println(count - intersection);
        out.close();
    }
}
