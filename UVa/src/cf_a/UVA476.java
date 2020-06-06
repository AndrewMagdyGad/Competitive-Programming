package cf_a;

/**
 * Online Judge: UVa.
 * Problem Code: UVA 476.
 * Problem Name: Points in Figures: Rectangles.
 * Date : 05/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] inputs = line.split(" ");
        double[][] rectangles = new double[10][4];
        int index = 0, pointCounter = 0;
        while (!inputs[0].equals("*")) {
            rectangles[index][0] = Double.parseDouble(inputs[1]);
            rectangles[index][1] = Double.parseDouble(inputs[2]);
            rectangles[index][2] = Double.parseDouble(inputs[3]);
            rectangles[index][3] = Double.parseDouble(inputs[4]);
            index++;
            line = input.nextLine();
            inputs = line.split(" ");
        }
        line = input.nextLine();
        inputs = line.split(" ");
        while(!(inputs[0].equals("9999.9") && inputs[1].equals("9999.9"))) {
            double x = Double.parseDouble(inputs[0]);
            double y = Double.parseDouble(inputs[1]);
            boolean check = false;
            for (int i = 0; i < index; i++) {
                double x1 = rectangles[i][0];
                double y1 = rectangles[i][1];
                double x2 = rectangles[i][2];
                double y2 = rectangles[i][3];
                if (x > x1 && x < x2 && y < y1 && y > y2) {
                    System.out.println("Point " + (pointCounter + 1) + " is contained in figure " + (i + 1));
                    check = true;
                }
            }
            if (!check)
                System.out.println("Point " + (pointCounter + 1) + " is not contained in any figure");
            pointCounter++;
            line = input.nextLine();
            inputs = line.split(" ");
        }
    }
}
