package cf_a;

/**
 * Online Judge: SPOJ.
 * Problem Name: EASY MATH.
 * Date : 17/01/2020.
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
        long n, m, a, d, count;
        for (int z = 0; z < t; z++) {
            line = reader.readLine();
            inputs = line.split(" ");
            n = Long.parseLong(inputs[0]);
            m = Long.parseLong(inputs[1]);
            a = Long.parseLong(inputs[2]);
            d = Long.parseLong(inputs[3]);
            long[] ar = new long[5];
            ar[0] = a;
            ar[1] = a + d;
            ar[2] = a + 2 * d;
            ar[3] = a + 3 * d;
            ar[4] = a + 4 * d;
            count = 0;

            for (byte i = 0 ; i < 2 ; i++) {
                for (byte j = 0; j < 2; j++) {
                    for (byte k = 0; k < 2; k++) {
                        for (byte l = 0; l < 2; l++) {
                            for (byte o = 0; o < 2; o++) {
                                long divisible = 1;
                                int eleCount = 0;

                                if (i == 1) {
                                    divisible *= ar[0];
                                    eleCount++;
                                }

                                if (j == 1) {
                                    divisible = lcm(divisible, ar[1]);
                                    eleCount++;
                                }


                                if (k == 1) {
                                    divisible = lcm(divisible, ar[2]);
                                    eleCount++;
                                }

                                if (l == 1) {
                                    divisible = lcm(divisible, ar[3]);
                                    eleCount++;
                                }

                                if (o == 1) {
                                    divisible = lcm(divisible, ar[4]);
                                    eleCount++;
                                }

                                if (eleCount == 0) {
                                    continue;
                                }

                                int sign = eleCount % 2 == 0 ? -1 : 1;
                                count += sign * ((m / divisible) + 1 - ((n + divisible - 1) / divisible));
                            }
                        }
                    }
                }
            }
            out.println(m - n + 1 - count);
            out.flush();
        }
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
