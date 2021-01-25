package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM500-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.Arrays;
import java.util.Scanner;

public class SRM500_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++)
            cards[i] = input.nextInt();
        System.out.println(maxTurns(cards));
    }

    public static int maxTurns(int[] cards) {
        Arrays.sort(cards);
        int answer = 1;
        int previous = cards[0];
        for (int i = 1; i < cards.length; i++) {
            if (cards[i] != previous + 1) {
                answer++;
                previous = cards[i];
            }
        }
        return answer;
    }
}
