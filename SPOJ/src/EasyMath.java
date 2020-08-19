/**
 * Online Judge: SPOJ.
 * Problem Name: EASY MATH.
 * Date : 19/08/2020.
 * @author Andrew
 */
import java.io.*;

public class EasyMath {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;
        String[] inputs;
        
        line = reader.readLine();
        int t = Integer.parseInt(line);
        long n, m, a, d;
        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            inputs = line.split(" ");
            n = Long.parseLong(inputs[0]);
            m = Long.parseLong(inputs[1]);
            a = Long.parseLong(inputs[2]);
            d = Long.parseLong(inputs[3]);
            long[] arr = {a, a + d, a + 2 * d, a + 3 * d, a + 4 * d};
            long range = m - n + 1;
            out.println(range - (findCount(m, arr) - findCount(n - 1, arr)));
            out.flush();
        }
    }

    public static long findCount(long number, long[] arr) {
        long count = 0;
        for (byte i = 0 ; i < 2 ; i++)
            for (byte j = 0; j < 2; j++)
                for (byte k = 0; k < 2; k++)
                    for (byte l = 0; l < 2; l++)
                        for (byte m = 0; m < 2; m++) {
                            long divisible = 1;
                            int eleCount = 0;

                            if (i == 1) {
                                divisible = lcm(divisible, arr[0]);
                                eleCount++;
                            }

                            if (j == 1) {
                                divisible = lcm(divisible, arr[1]);
                                eleCount++;
                            }


                            if (k == 1) {
                                divisible = lcm(divisible, arr[2]);
                                eleCount++;
                            }

                            if (l == 1) {
                                divisible = lcm(divisible, arr[3]);
                                eleCount++;
                            }

                            if (m == 1) {
                                divisible = lcm(divisible, arr[4]);
                                eleCount++;
                            }

                            if (eleCount == 0) {
                                continue;
                            }

                            int sign = eleCount % 2 == 0 ? -1 : 1;
                            count += sign * number / divisible;
                        }
        return count;
    }
    
    /*
     * this method returns the least common multiple for example
     * divisors: 2, 4, 8 it will return 8
     */
    public static long lcm(long a, long b) {
        if (a < b)
            return (a * b) / gcd(a, b);
        return (a * b) / gcd(b, a);
    }
    
    public static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
