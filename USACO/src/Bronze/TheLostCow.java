package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: lostcow
 */
import java.io.*;
import java.util.StringTokenizer;

public class TheLostCow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int distance = 0;
        int factor = 1;
        boolean sign = true;
        boolean onRight = y > x;
        int previousX = x;
        int currentX = x;

        while (currentX != y) {
            currentX = sign ? x + factor : x - factor;
            if (onRight && currentX > y)
                currentX = y;
            else if (!onRight && currentX < y)
                currentX = y;
            distance += Math.abs(previousX - currentX);
            previousX = currentX;
            factor *= 2;
            sign = !sign;
        }

        out.println(distance);
        out.close();
    }
}
