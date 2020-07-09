package Algorithms.Graphs.GraphRepresentation;

/**
 * Online Judge: HackerEarth.
 * Problem Name: Edge Existence.
 * Problem Link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/tutorial/
 * Date : 10/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class EdgeExistence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNext()) {
            int n = input.nextInt();
            int m = input.nextInt();
            int a, b, q;
            boolean[][] adjacencyMatrix = new boolean[n][n];
            for (int i = 0; i < m; i++) {
                a = input.nextInt();
                b = input.nextInt();
                adjacencyMatrix[a - 1][b - 1] = true;
                adjacencyMatrix[b - 1][a - 1] = true;
            }
            q = input.nextInt();
            for (int i = 0; i < q; i++) {
                a = input.nextInt();
                b = input.nextInt();
                if (adjacencyMatrix[a - 1][b - 1])
                    System.out.println("YES");
                else
                    System.out.println("NO"); 
            }
        }
    }
}
