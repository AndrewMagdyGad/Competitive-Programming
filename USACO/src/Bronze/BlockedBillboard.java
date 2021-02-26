package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: billboard
 */
import java.io.*;
import java.util.StringTokenizer;

public class BlockedBillboard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int x5 = Integer.parseInt(st.nextToken());
        int y5 = Integer.parseInt(st.nextToken());
        int x6 = Integer.parseInt(st.nextToken());
        int y6 = Integer.parseInt(st.nextToken());

        int area1 = (x2 - x1) * (y2 - y1);
        int area2 = (x4 - x3) * (y4 - y3);

        int dx1 = Math.max(x1, x5);
        int dy1 = Math.max(y1, y5);
        int dx2 = Math.min(x2, x6);
        int dy2 = Math.min(y2, y6);
        if (dx1 <= dx2 && dy1 <= dy2)
            area1 -= (dx2 - dx1) * (dy2 - dy1);

        dx1 = Math.max(x3, x5);
        dy1 = Math.max(y3, y5);
        dx2 = Math.min(x4, x6);
        dy2 = Math.min(y4, y6);
        if (dx1 <= dx2 && dy1 <= dy2)
            area2 -= (dx2 - dx1) * (dy2 - dy1);

        out.println(area1 + area2);
        out.close();
    }
}
