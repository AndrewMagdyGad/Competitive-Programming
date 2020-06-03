package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF556-D2-A.
 * Problem Name: Case of the Zeros and Ones.
 * Date : 28/03/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF556_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String line = input.next();
        int numberOfOnes = 0, numberOfZeros = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1')
                numberOfOnes++;
            else
                numberOfZeros++;
        }
        System.out.println(Math.abs(numberOfOnes - numberOfZeros));
    }
}
