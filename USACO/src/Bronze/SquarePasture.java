package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: square
 */
import java.io.*;
import java.util.StringTokenizer;

public class SquarePasture {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("square.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
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

        int minX1 = Math.min(x1, x3);
        int minY1 = Math.min(y1, y3);
        int maxX2 = Math.max(x2, x4);
        int maxY2 = Math.max(y2, y4);

        int squareSide = Math.max(maxX2 - minX1, maxY2 - minY1);

        out.println(squareSide * squareSide);
        out.close();
    }
}
