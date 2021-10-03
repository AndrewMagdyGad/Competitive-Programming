package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF88-D2-B.
 * Problem Name: Keyboard.
 * Date : 26/03/2021.
 * @author Andrew
 */
import java.util.*;

public class CF88_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int x = input.nextInt();
        Map<Character, List<int[]>> lowercaseMap = new HashMap<>();
        List<int[]> shiftList = new ArrayList<>();
        Map<Character, Double> uppercaseMap = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String line = input.next();
            for (int j = 0; j < line.length(); j++) {
                char current = line.charAt(j);
                if (current == 'S')
                    shiftList.add(new int[]{i, j});
                else {
                    List<int[]> coordinates;
                    if (lowercaseMap.containsKey(current))
                        coordinates = lowercaseMap.get(current);
                    else
                        coordinates = new ArrayList<>();
                    coordinates.add(new int[]{i, j});
                    lowercaseMap.put(current, coordinates);
                }
            }
        }

        if (shiftList.size() > 0) {
            for (Map.Entry<Character, List<int[]>> entry : lowercaseMap.entrySet()) {
                double distance = Double.MAX_VALUE;
                for (int[] item : entry.getValue()) {
                    int r = item[0];
                    int c = item[1];

                    for (int i = 0; i < shiftList.size(); i++) {
                        int[] current = shiftList.get(i);
                        distance = Math.min(distance, getDistance(c, r, current[1], current[0]));
                    }
                }
                uppercaseMap.put(Character.toUpperCase(entry.getKey()), distance);
            }
        }

        int q = input.nextInt();
        String text = input.next();
        for (int i = 0; i < q; i++) {
            char current = text.charAt(i);
            if (Character.isLowerCase(current)) {
                if (!lowercaseMap.containsKey(current)) {
                    answer = -1;
                    break;
                }
            }
            else {
                if (!uppercaseMap.containsKey(current)) {
                    answer = -1;
                    break;
                }
                else {
                    double distance = uppercaseMap.get(current);
                    if (distance > x)
                        answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
