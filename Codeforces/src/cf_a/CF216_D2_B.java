package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF216-D2-B.
 * Problem Name: Forming Teams.
 * Date : 11/05/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF216_D2_B {
    static int timer;
    static int removedStudents;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean[] isVisited = new boolean[n];
        boolean[][] adjacencyMatrix = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            adjacencyMatrix[a - 1][b - 1] = true;
            adjacencyMatrix[b - 1][a - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!isVisited[i])
                dfs(isVisited, adjacencyMatrix, i, -1, 1);
        }
        int answer = n - removedStudents;
        answer = (answer % 2 != 0) ? answer - 1 : answer;
        System.out.println(n - answer);
    }
    
    public static void dfs(boolean[] isVisited, boolean[][] adjacencyMatrix, int node, int previousNode, int size) {
        isVisited[node] = true;
        boolean isCycle = false;
        for (int i = 0; i < adjacencyMatrix[node].length; i++) {
            if (adjacencyMatrix[node][i]) {
                if (!isVisited[i])
                    dfs(isVisited, adjacencyMatrix, i, node, ++size);
                else
                    if (i != previousNode) {
                        isCycle = true;
                        break;
                    }
            }
        }
        if (isCycle && size % 2 != 0) {
            removedStudents++;
        }
    }
}
