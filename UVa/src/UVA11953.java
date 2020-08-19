/**
 * Online Judge: UVa.
 * Problem Code: UVA 11953.
 * Problem Name: Battleships.
 * Date : 24/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA11953 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] array;
        boolean[][] isVisited;
        int count;
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            array = new String[n];
            isVisited = new boolean[n][n];
            count = 0;
            for (int j = 0; j < n; j++)
                array[j] = input.next();
            
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (!isVisited[j][k] && array[j].charAt(k) == 'x') {
                        dfs(isVisited, array, j, k);
                        count++;
                    }
                }
            }
            System.out.println("Case " + (i + 1) + ": " + count);
        }
    }
    
    private static boolean isValid(int x, int y, int size) {
        return x >= 0 && y >= 0 && x < size && y < size;
    }
    
    private static void dfs(boolean[][] isVisited, String[] array, int i, int j) {
        isVisited[i][j] = true;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int k = 0; k < dx.length; k++) {
            int a = dx[k] + i;
            int b = dy[k] + j;
            if (isValid(a, b, array.length) && !isVisited[a][b] && (array[a].charAt(b) == 'x' || array[a].charAt(b) == '@'))
                dfs(isVisited, array, a, b);
        }
    }
}
