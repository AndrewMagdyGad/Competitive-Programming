package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: mowing
 */
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class MowingTheField {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("mowing.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());

        char[] directions = new char[n];
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            directions[i] = st.nextToken().charAt(0);
            steps[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        Map<String, Integer> gridMap = new HashMap<>();
        int x = 0, y = 0, t = 0;
        int deltaX = 0, deltaY = 0;
        for (int i = 0; i < n; i++) {
            char current = directions[i];
            int count = steps[i];
            switch (current) {
                case 'N':
                    deltaY = 1;
                    deltaX = 0;
                    break;
                case 'E':
                    deltaY = 0;
                    deltaX = 1;
                    break;
                case 'S':
                    deltaY = -1;
                    deltaX = 0;
                    break;
                case 'W':
                    deltaY = 0;
                    deltaX = -1;
                    break;
            }

            for (int j = 0; j < count; j++) {
                x += deltaX;
                y += deltaY;
                String key = x + "," + y;
                int time = ++t;
                if (gridMap.containsKey(key))
                    answer = Math.min(answer, time - gridMap.get(key));
                gridMap.put(key, time);
            }
        }

        out.println(answer == Integer.MAX_VALUE ? -1 : answer);
        out.close();
    }
}
