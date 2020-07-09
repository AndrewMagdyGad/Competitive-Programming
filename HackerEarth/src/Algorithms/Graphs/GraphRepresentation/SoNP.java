package Algorithms.Graphs.GraphRepresentation;

/**
 * Online Judge: HackerEarth.
 * Problem Name: So NP.
 * Problem Link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/so-np-c559f406/
 * Date : 11/04/2020.
 * @author Andrew
 */
import java.util.*;

public class SoNP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        List<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjacencyList[i] = new ArrayList();
        for (int i = 0; i < m; i++) {
            int a = input.nextInt() - 1;
            int b = input.nextInt() - 1;
            adjacencyList[a].add(b);
            adjacencyList[b].add(a);
        }
        int count = numberOfConnectedComponents(adjacencyList);
        System.out.println(count > k ? -1 : m - (n - k));
    }
    
    public static int numberOfConnectedComponents(List[] adjacencyList) {
        int count = 0;
        int size = adjacencyList.length;
        boolean[] isVisited = new boolean[size];
        for (int i = 0; i < size; i++)
            if (!isVisited[i]) {
                count++;
                dfs(isVisited, adjacencyList, i);
            }
        return count;
    }
    
    public static void dfs(boolean[] isVisited, List<Integer>[] adjacencyList, int i) {
        isVisited[i] = true;
        Stack<Integer> stack = new Stack();
        for (int j = 0; j < adjacencyList[i].size(); j++)
            stack.push(adjacencyList[i].get(j));
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (!isVisited[current]) {
                isVisited[current] = true;
                for (int j = 0; j < adjacencyList[current].size(); j++)
                    stack.push(adjacencyList[current].get(j));
            }
        }
    }
}
