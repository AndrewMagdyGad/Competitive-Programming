package cf_c;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF1216-D3-C.
 * Problem Name: White Sheet.
 * Date : 29/01/2021.
 * @author Andrew
 */
import java.util.Scanner;

public class CF1216_D3_C {
    static class Rect {
        public int x1, y1, x2, y2;
        public boolean isValid;

        public Rect(int x1, int y1, int x2, int y2, boolean isValid) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.isValid = isValid;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        Rect whiteSheet = new Rect(x1, y1, x2, y2, true);

        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        Rect blackSheet1 = new Rect(x1, y1, x2, y2, true);

        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        Rect blackSheet2 = new Rect(x1, y1, x2, y2, true);

        Rect whiteBlackIntersection1 = getIntersectionRect(whiteSheet, blackSheet1);
        Rect whiteBlackIntersection2 = getIntersectionRect(whiteSheet, blackSheet2);
        Rect blackBlackIntersection = null;
        if (whiteBlackIntersection1.isValid && whiteBlackIntersection2.isValid)
            blackBlackIntersection = getIntersectionRect(whiteBlackIntersection1, whiteBlackIntersection2);

        long whiteSheetArea = getArea(whiteSheet);
        long whiteBlackArea1 = getArea(whiteBlackIntersection1);
        long whiteBlackArea2 = getArea(whiteBlackIntersection2);
        long blackBlackArea = blackBlackIntersection != null ? getArea(blackBlackIntersection) : 0;

        if (whiteSheetArea > whiteBlackArea1 + whiteBlackArea2 - blackBlackArea)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static Rect getIntersectionRect(Rect r1, Rect r2) {
        int intersectionX1 = Math.max(r1.x1, r2.x1);
        int intersectionY1 = Math.max(r1.y1, r2.y1);
        int intersectionX2 = Math.min(r1.x2, r2.x2);
        int intersectionY2 = Math.min(r1.y2, r2.y2);

        if (intersectionX2 > intersectionX1 && intersectionY2 > intersectionY1)
            return new Rect(intersectionX1, intersectionY1, intersectionX2, intersectionY2, true);

        return new Rect(0, 0, 0, 0, false);
    }

    public static long getArea(Rect r) {
        return (long) (r.x2 - r.x1) * (r.y2 - r.y1);
    }
}
