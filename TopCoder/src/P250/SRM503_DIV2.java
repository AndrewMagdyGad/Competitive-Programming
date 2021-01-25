package P250;

/**
 * Online Judge: TopCoder.
 * Problem Code: SRM503-Div2-250.
 * Date : 30/12/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class SRM503_DIV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upper_limit = input.nextInt();
        int layer_count = input.nextInt();
        System.out.println(apply(upper_limit, layer_count));
    }

    public static int apply(int upper_limit, int layer_count) {
        return layer_count / upper_limit + (layer_count % upper_limit == 0 ? 0 : 1);
    }
}
