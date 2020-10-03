/**
 * Online Judge: SPOJ.
 * Problem Code: ARITH2.
 * Problem Name: Simple Arithmetics II.
 * Date : 08/09/2020.
 * @author Andrew
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleArithmeticsII {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            reader.readLine();
            String line = reader.readLine();
            List<String> list = new ArrayList<>();
            StringBuilder number = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                char current = line.charAt(j);
                if (!Character.isDigit(current) && !Character.isWhitespace(current)) {
                    list.add(number.toString());
                    list.add(String.valueOf(current));
                    number = new StringBuilder();
                }
                else if (Character.isDigit(current))
                    number.append(current);
            }
            long answer = Long.parseLong(list.get(0));
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j).equals("+"))
                    answer += Long.parseLong(list.get(j + 1));
                else if (list.get(j).equals("-"))
                    answer -= Long.parseLong(list.get(j + 1));
                else if (list.get(j).equals("*"))
                    answer *= Long.parseLong(list.get(j + 1));
                else if (list.get(j).equals("/"))
                    answer /= Long.parseLong(list.get(j + 1));
            }
            out.println(answer);
            out.flush();
        }
    }
}
