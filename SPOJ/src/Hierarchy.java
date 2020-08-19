/**
 * Online Judge: SPOJ.
 * Problem Name: Hierarchy.
 * Date : 16/05/2020.
 * @author Andrew
 */
import java.util.*;
import java.io.*;

public class Hierarchy {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;
        String[] inputs;
        line = reader.readLine();
        inputs = line.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        boolean[] isVisited = new boolean[n];
        int[] parent = new int[n];
        Stack<Integer> topsort = new Stack();
        List<Integer>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjacencyList[i] = new ArrayList();
        for (int i = 0; i < k; i++) {
            line = reader.readLine();
            inputs = line.split(" ");
            int w = Integer.parseInt(inputs[0]);
            for (int j = 0; j < w; j++) {
                int s = Integer.parseInt(inputs[j + 1]);
                adjacencyList[i].add(s - 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) 
                dfs(isVisited, adjacencyList, topsort, i);
        }

        int position = 0;
        for (int i = n - 1; i >= 0; i--) {
            int item = topsort.pop(); 
            parent[item] = position;
            position = item + 1;
        }

        for (int i = 0; i < n; i++) {
            out.println(parent[i]);
            out.flush();
        }
    }
    
    public static void dfs(boolean[] isVisited, List<Integer>[] adjacencyList, Stack<Integer> topsort, int node) {
        isVisited[node] = true;
        for (int i = 0; i < adjacencyList[node].size(); i++) {
            if (!isVisited[adjacencyList[node].get(i)]) {
                dfs(isVisited, adjacencyList, topsort, adjacencyList[node].get(i));
            }
        }
        topsort.push(node);
    }
}
