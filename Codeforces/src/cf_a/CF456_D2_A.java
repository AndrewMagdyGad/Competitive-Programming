package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF456-D2-A.
 * Problem Name: Laptops.
 * Date : 15/06/2020.
 * @author Andrew
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CF456_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] price = new int[n];
        int[] quality = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = input.nextInt();
            quality[i] = input.nextInt();
            map.put(price[i], quality[i]);
        }
        Arrays.sort(price);
        Arrays.sort(quality);
        String answer = "Poor Alex";
        for (int i = n - 1; i >= 0; i--) {
            if (map.get(price[i]) != quality[i]) {
                answer = "Happy Alex";
                break;
            }
        }
        System.out.println(answer);
    }
}
