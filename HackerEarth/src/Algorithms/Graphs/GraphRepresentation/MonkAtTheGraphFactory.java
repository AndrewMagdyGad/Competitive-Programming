package Algorithms.Graphs.GraphRepresentation;

/**
 * Online Judge: HackerEarth.
 * Problem Name: Monk at the Graph Factory.
 * Problem Link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/monk-at-the-graph-factory/
 * Date : 15/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class MonkAtTheGraphFactory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += input.nextInt();
        
        if ((n - 1) * 2 == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
