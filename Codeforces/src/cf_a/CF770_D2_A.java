package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF770-D2-A.
 * Problem Name: New Password.
 * Date : 17/11/2018.
 * @author Andrew
 */
import java.util.Scanner;

public class CF770_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int index;
        String password = "";
        for (int i = 0; i < k; i++)
            password += (char)(i + 'a'); 
        while (password.length() != n) {
            index = 0;
            while (password.charAt(password.length() - 1) == password.charAt(index))
                index++;
            password += password.charAt(index);
        }
        System.out.println(password);
    }
}
