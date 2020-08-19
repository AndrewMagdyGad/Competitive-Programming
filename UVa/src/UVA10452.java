/**
 * Online Judge: UVa.
 * Problem Code: UVA 10452.
 * Problem Name: Marcus.
 * Date : 24/04/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10452 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        char[] validLetters = {'@', 'I', 'E', 'H', 'O', 'V', 'A', '#'};
        for (int i = 0; i < t; i++) {
            int m = input.nextInt();
            int n = input.nextInt();
            String[] array = new String[m];
            int startX = -1, startY = -1;
            for (int j = 0; j < m; j++) {
                array[j] = input.next();
                if (array[j].contains("@")) {
                    startX = array[j].indexOf('@');
                    startY = j;
                }
            }
            getPath(1, validLetters, array, startX, startY);
        }
    }
    
    private static boolean isValid(int x, int y, int length, int width) {
        return x >= 0 && y >= 0 && x < width && y < length;
    }
    
    private static void printCommand(int oldX, int newX) {
        if (newX < oldX)
            System.out.print("left");
        else if (newX > oldX)
            System.out.print("right");
        else
            System.out.print("forth");
    }
    
    private static void getPath(int nextCharIndex, char[] validLetters, String[] array, int x, int y) {
        int[] dx = {1, -1, 0};
        int[] dy = {0, 0, -1};
        for (int i = 0; i < dx.length; i++) {
            int a = dx[i] + x;
            int b = dy[i] + y;
            if (isValid(a, b, array.length, array[0].length()) && array[b].charAt(a) == validLetters[nextCharIndex]) {
                printCommand(x, a);
                if (nextCharIndex < validLetters.length - 1) {
                    System.out.print(" ");
                    getPath(nextCharIndex + 1, validLetters, array, a, b);
                }
                else
                    System.out.println();
                break;
            }
        }
    }
}
