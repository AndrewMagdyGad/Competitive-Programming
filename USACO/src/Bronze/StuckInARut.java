package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
 */
import java.util.*;

public class StuckInARut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] directions = new char[n];
        int[][] coordinates = new int[n][2];
        int[] cows = new int[n];

        Arrays.fill(cows, Integer.MAX_VALUE);
        List<Integer> intersections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            directions[i] = input.next().charAt(0);
            coordinates[i][0] = input.nextInt();
            coordinates[i][1] = input.nextInt();
        }

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                intersections.add(Math.abs(coordinates[i][0] - coordinates[j][0]));
                intersections.add(Math.abs(coordinates[i][1] - coordinates[j][1]));
            }

        Collections.sort(intersections);
        for (int d : intersections) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int x1 = coordinates[i][0];
                    int y1 = coordinates[i][1];
                    int x2 = coordinates[j][0];
                    int y2 = coordinates[j][1];

                    if (directions[i] == 'E' && directions[j] == 'N' && x1 < x2 && y1 > y2) {
                        if (x1 + d == x2 && y2 + Math.min(d, cows[j]) > y1)
                            cows[i] = Math.min(cows[i], d);
                        else if (y2 + d == y1 && x1 + Math.min(d, cows[i]) > x2)
                            cows[j] = Math.min(cows[j], d);
                    }
                }
            }
        }

        for (int cow : cows)
            System.out.println(cow == Integer.MAX_VALUE ? "Infinity" : cow);
    }
}
