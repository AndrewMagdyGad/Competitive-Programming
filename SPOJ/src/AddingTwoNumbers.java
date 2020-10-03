/**
 * Online Judge: SPOJ.
 * Problem Code: ADUN.
 * Problem Name: Adding two numbers.
 * Date : 08/09/2020.
 * @author Andrew
 */
import java.io.*;

public class AddingTwoNumbers {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Long a = Long.parseLong(reader.readLine());
        Long b = Long.parseLong(reader.readLine());
        out.println(a + b);
        out.flush();
    }
}
