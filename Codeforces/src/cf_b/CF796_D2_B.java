package cf_b;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF796-D2-B.
 * Problem Name: Find The Bone.
 * Date : 28/03/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF796_D2_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        boolean[] holes = new boolean[n + 1];
        int boneIndex = 1;
        for (int i = 0; i < m; i++)
            holes[input.nextInt()] = true;
        boolean isDone = holes[1];

        for (int i = 0; i < k && !isDone; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == boneIndex) {
                boneIndex = b;
                if (holes[b])
                    isDone = true;
            }
            else if (b == boneIndex) {
                boneIndex = a;
                if (holes[a])
                    isDone = true;
            }
        }

        System.out.println(boneIndex);
    }
}
