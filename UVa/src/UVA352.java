/**
 * Online Judge: UVa.
 * Problem Code: UVA 352.
 * Problem Name: The Seasonal War.
 * Date : 02/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA352 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, answer, count = 0;
        String[] array;
        boolean[][] isVisited;
        
        while (input.hasNext()) {
            answer = 0;
            count++;
            size = input.nextInt();
            array = new String[size];
            isVisited = new boolean[size][size];
            for (int i = 0; i < size; i++)
                array[i] = input.next();
            
            for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++) {
                    if (array[i].charAt(j) - '0' == 1 && !isVisited[i][j]) {
                        dfs(isVisited, array, i, j);
                        answer++;
                    } 
                }
            System.out.println("Image number " + count + " contains " + answer + " war eagles.");
        }
    }
    
    private static boolean isValid(int i, int j, int size) {
        return i >= 0 && j >= 0 && i < size && j < size;
    }
    
    private static void dfs(boolean[][] isVisited, String[] array, int x, int y) {
        isVisited[x][y] = true;
        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
        int[] dy = {1, -1, 0, 1, -1, 0, 1, -1};
        for (int k = 0; k < dx.length; k++) {
            int a = dx[k] + x;
            int b = dy[k] + y;
            if (isValid(a, b, array.length) && !isVisited[a][b] && array[a].charAt(b) - '0' == 1)
                dfs(isVisited, array, a, b);
        }
    }
}
