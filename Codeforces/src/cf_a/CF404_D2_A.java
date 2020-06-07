package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF404-D2-A.
 * Problem Name: Valera and X.
 * Date : 07/06/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class CF404_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] array = new String[n];
        input.nextLine();
        for (int i = 0; i < n; i++)
            array[i] = input.nextLine();
        char diagonalCharacter = array[0].charAt(0);
        char otherCharacter = array[0].charAt(1);
        int left = 0, right = n - 1;
        boolean isX = true;
        if (diagonalCharacter == otherCharacter)
            System.out.printf("NO");
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == left || j == right) {
                        if (array[i].charAt(j) != diagonalCharacter) {
                            isX = false;
                            break;
                        }
                    } else {
                        if (array[i].charAt(j) != otherCharacter) {
                            isX = false;
                            break;
                        }
                    }
                }
                if (!isX)
                    break;
                left++;
                right--;
            }
            System.out.println(isX ? "YES" : "NO");
        }
    }
}
