package cf_a;

/**
 * Online Judge: UVa.
 * Problem Code: UVA 10242.
 * Problem Name: Fourth Point !!.
 * Date : 06/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10242 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double x = 0, y = 0, xSum = 0, ySum = 0;
            double[][] array = new double[4][2];
            for (int i = 0; i < 4; i++) {
                array[i][0] = input.nextDouble();
                array[i][1] = input.nextDouble();
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i != j) {
                        if (array[i][0] == array[j][0] && array[i][0] == array[j][0]) {
                            x = array[i][0];
                            y = array[i][1];
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                if (!(array[i][0] == x && array[i][1] == y)) {
                    xSum += array[i][0];
                    ySum += array[i][1];
                }
            }
            System.out.printf("%.3f %.3f\n", (xSum - x), (ySum - y));
        }
    }
}
