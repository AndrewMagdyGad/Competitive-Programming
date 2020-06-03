package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF490-D2-A.
 * Problem Name: Team Olympiad.
 * Date : 15/11/2018.
 * @author Andrew
 */
import java.util.*;

public class CF490_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> programming = new ArrayList<>();
        List<Integer> maths = new ArrayList<>();
        List<Integer> physicalEducation = new ArrayList<>();
        int t, w;
        for (int i = 0; i < n; i++) {
            t = input.nextInt();
            switch (t) {
                case 1:
                    programming.add(i + 1);
                    break;
                case 2:
                    maths.add(i + 1);
                    break;
                default:
                    physicalEducation.add(i + 1);
            }
        }
        w = Math.min(physicalEducation.size(), Math.min(programming.size(), maths.size()));
        System.out.println(w);
        for (int i = 0; i < w; i++)
            System.out.println(programming.get(i) + " " + maths.get(i) + " " + physicalEducation.get(i));
    }
}
