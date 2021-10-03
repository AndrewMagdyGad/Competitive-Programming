/**
 * Online Judge: UVa.
 * Problem Code: UVA 713.
 * Problem Name: Adding Reversed Numbers.
 * Date : 07/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA713 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String num1 = input.next();
            String num2 = input.next();
            System.out.println(add(num1, num2));
        }
    }

    public static String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int size = Math.max(num1.length(), num2.length());
        int carry = 0;
        int startIndex = 0;
        for (int i = 0; i < size; i++) {
            int a = i < num1.length() ? num1.charAt(i) - '0' : 0;
            int b = i < num2.length() ? num2.charAt(i) - '0' : 0;

            int digit = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;
            result.append(digit);
        }

        if (carry > 0)
            result.append(carry);

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '0')
                break;
            startIndex++;
        }

        return result.substring(startIndex);
    }
}
