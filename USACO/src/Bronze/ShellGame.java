package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: shell
 */
import java.io.*;
import java.util.StringTokenizer;

public class ShellGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("shell.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());

        int firstCounter = 0, secondCounter = 0, thirdCounter = 0;
        int initialAtFirst = 1, initialAtSecond = 2, initialAtThird = 3;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            // check for first initial location
            if (a == initialAtFirst || b == initialAtFirst)
                initialAtFirst = (a == initialAtFirst) ? b : a;
            if (g == initialAtFirst)
                firstCounter++;

            // check for second initial location
            if (a == initialAtSecond || b == initialAtSecond)
                initialAtSecond = (a == initialAtSecond) ? b : a;
            if (g == initialAtSecond)
                secondCounter++;

            // check for third initial location
            if (a ==  initialAtThird || b ==  initialAtThird)
                initialAtThird = (a ==  initialAtThird) ? b : a;
            if (g ==  initialAtThird)
                thirdCounter++;
        }

        out.println(Math.max(Math.max(firstCounter, secondCounter), thirdCounter));
        out.close();
    }
}
