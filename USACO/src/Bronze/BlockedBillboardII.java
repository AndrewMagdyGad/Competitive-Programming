package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: billboard
 */
import java.io.*;
import java.util.StringTokenizer;

public class BlockedBillboardII {
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

        int area = (x2 - x1) * (y2 - y1);

        int intersectionX1 = Math.max(x1, x3);
        int intersectionY1 = Math.max(y1, y3);
        int intersectionX2 = Math.min(x2, x4);
        int intersectionY2 = Math.min(y2, y4);

        int intersectionWidth = intersectionX2 - intersectionX1;
        int intersectionHeight = intersectionY2 - intersectionY1;
        if (intersectionWidth > 0 && intersectionHeight > 0) {
            int count = 0;
            if (touchCorner(x1, y1, intersectionX1, intersectionY1))
                count++;
            if (touchCorner(x1, y2, intersectionX1, intersectionY2))
                count++;
            if (touchCorner(x2, y1, intersectionX2, intersectionY1))
                count++;
            if (touchCorner(x2, y2, intersectionX2, intersectionY2))
                count++;

            if (count >= 2)
                area -= (intersectionX2 - intersectionX1) * (intersectionY2 - intersectionY1);
        }

        out.println(area);
        out.close();
    }

    public static boolean touchCorner(int a, int b, int x, int y) {
        return a == x && b == y;
    }
}
