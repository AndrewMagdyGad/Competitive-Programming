package cf_a;

/**
 * Online Judge: UVa.
 * Problem Code: UVA 10305.
 * Problem Name: Ordering Tasks.
 * Date : 21/05/2020.
 * @author Andrew
 */
import java.util.*;

public class UVA10305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        while (n != 0 || m != 0) {
            boolean[] isVisited = new boolean[n];
            Stack<Integer> topsort = new Stack();
            List<Integer>[] adjacencyList = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adjacencyList[i] = new ArrayList();
            for (int i = 0; i < m; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                adjacencyList[a - 1].add(b - 1);
            }
            
            for (int i = 0; i < n; i++)
                if (!isVisited[i])
                    dfs(isVisited, adjacencyList, topsort, i);
            
            while (!topsort.isEmpty())
                System.out.print(topsort.pop() + 1 + " ");
            System.out.println();
            n = input.nextInt();
            m = input.nextInt();
        }
    }
    
    public static void dfs(boolean[] isVisited, List<Integer>[] adjacencyList, Stack<Integer> topsort, int node) {
        isVisited[node] = true;
        for (int i = 0; i < adjacencyList[node].size(); i++) {
            int child = adjacencyList[node].get(i);
            if (!isVisited[child])
                dfs(isVisited, adjacencyList, topsort, child);
        }
        topsort.push(node);
    }
}
