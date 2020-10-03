/**
 * Online Judge: SPOJ.
 * Problem Code: MIRRORED.
 * Problem Name: Mirrored Pairs.
 * Date : 13/09/2020.
 * @author Andrew
 */
import java.io.*;
import java.util.Map;

public class MirroredPairs {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        Map<String, String> map = Map.of("b", "d", "d", "b", "q", "p", "p", "q");
        String line = reader.readLine();
        out.println("Ready");
        out.flush();
        while (!line.equals("  ")) {
            String[] array = line.split("");
            if (map.containsKey(array[0]) && map.get(array[0]).equals(array[1]))
                out.println("Mirrored pair");
            else
                out.println("Ordinary pair");
            out.flush();
            line = reader.readLine();
        }
    }
}
