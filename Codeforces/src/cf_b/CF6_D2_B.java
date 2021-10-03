package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF6-D2-B.
 * Problem Name: President's Office.
 * Date : 15/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF6_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char c = input.next().charAt(0);
        char[][] room = new char[n][m];
        boolean[] deputies = new boolean[26];
        int count = 0;
        for (int i = 0; i < n; i++)
            room[i] = input.next().toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char current = room[i][j];
                if (current == c)
                    count += process(i, j, c, room, deputies);
            }
        }

        System.out.println(count);
    }

    public static int process(int i, int j, char c, char[][] room, boolean[] deputies) {
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        int count = 0;
        for (int k = 0; k < x.length; k++) {
            int a = i + x[k];
            int b = j + y[k];
            if (a < 0 || a >= room.length || b < 0 || b >= room[0].length)
                continue;
            char current = room[a][b];
            if (current != c && current != '.' && !deputies[current - 'A']) {
                count++;
                deputies[current - 'A'] = true;
            }
        }
        return count;
    }
}
