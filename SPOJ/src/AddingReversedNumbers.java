/**
 * Online Judge: SPOJ.
 * Problem Code: ADDREV.
 * Problem Name: Adding Reversed Numbers.
 * Date : 13/09/2020.
 * @author Andrew
 */
import java.io.*;

public class AddingReversedNumbers {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            String line = reader.readLine();
            String number1 = line.split(" ")[0];
            String number2 = line.split(" ")[1];
            int sum = reverse(number1) + reverse(number2);
            out.println(reverse(String.valueOf(sum)));
            out.flush();
        }
    }
    public static int reverse(String number) {
        StringBuilder reversed = new StringBuilder(number);
        reversed.reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char current = number.charAt(i);
            if (current == '0')
                reversed.deleteCharAt(i);
            else
                break;
        }
        return reversed.length() > 0 ? Integer.valueOf(reversed.toString()) : 0;
    }
}
