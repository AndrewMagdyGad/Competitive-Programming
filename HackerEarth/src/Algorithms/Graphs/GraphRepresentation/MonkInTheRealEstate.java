package Algorithms.Graphs.GraphRepresentation;

/**
 * Online Judge: HackerEarth.
 * Problem Name: Monk in the real estate.
 * Problem Link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/monk-in-the-real-estate/
 * Date : 13/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class MonkInTheRealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int e = input.nextInt();
            boolean[] isVisited = new boolean[10000];
            int count = 0;
            for (int j = 0; j < e; j++) {
                int x = input.nextInt();
                int y = input.nextInt();
                if (!isVisited[x - 1]) {
                    isVisited[x - 1] = true;
                    count++;
                }
                if (!isVisited[y - 1]) {
                    isVisited[y - 1] = true;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
