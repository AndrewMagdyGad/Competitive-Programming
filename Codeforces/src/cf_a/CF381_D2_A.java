package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF381-D2-A.
 * Problem Name: Sereja and Dima.
 * Date : 04/10/2018.
 * @author Andrew
 */
import java.util.*;

public class CF381_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> array = new ArrayList<>();
        int countOfSereja = 0, countOfDima = 0, turn = 1;
        for (int i = 0; i < n; i++) 
            array.add(input.nextInt());
        while (array.size() > 0) {
            if (turn % 2 != 0) {
                if (array.get(array.size() - 1) >= array.get(0)) {
                    countOfSereja += array.get(array.size() - 1);
                    array.remove(array.size() - 1);
                }
                else {
                    countOfSereja += array.get(0);
                    array.remove(0);
                }
            }
            else {
                if (array.get(array.size() - 1) >= array.get(0)) {
                    countOfDima += array.get(array.size() - 1);
                    array.remove(array.size() - 1);
                }
                else {
                    countOfDima += array.get(0);
                    array.remove(0);
                }
            }
            turn++;
        }
        System.out.println(countOfSereja + " " + countOfDima);
    }
}
