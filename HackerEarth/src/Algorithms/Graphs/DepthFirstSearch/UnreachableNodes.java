package Algorithms.Graphs.DepthFirstSearch;

/**
 * Online Judge: HackerEarth.
 * Problem Name: Unreachable Nodes.
 * Problem Link: https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/
 * Date : 24/04/2020.
 * @author Andrew
 */
import java.util.*;

public class UnreachableNodes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean[] isVisited = new boolean[n];
        List<Integer>[] adjacencyList = new List[n];
        for (int i = 0; i < n; i++)
            adjacencyList[i] = new ArrayList();
        for (int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            adjacencyList[a - 1].add(b - 1);
            adjacencyList[b - 1].add(a - 1);
        }
        int x = input.nextInt();
        int count = 0;
        dfs(isVisited, adjacencyList, x - 1);
        for (int i = 0; i < isVisited.length; i++)
            if (!isVisited[i])
                count++;
        System.out.println(count);
    }
    
    public static void dfs(boolean[] isVisited, List<Integer>[] adjacencyList, int node) {
        isVisited[node] = true;
        for (int i = 0; i < adjacencyList[node].size(); i++)
            if (!isVisited[adjacencyList[node].get(i)])
                dfs(isVisited, adjacencyList, adjacencyList[node].get(i));
    }
}
