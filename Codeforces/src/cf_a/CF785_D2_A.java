package cf_a;

/**
 * Online Judge: CodeForces.
 * Problem Code: CF785-D2-A.
 * Problem Name: Anton and Polyhedrons.
 * Date : 09/06/2020.
 * @author Andrew
 */
import java.util.Map;
import java.util.Scanner;

public class CF785_D2_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> regularPolyhedrons = Map.of("Tetrahedron", 4, "Cube", 6, "Octahedron", 8, "Dodecahedron", 12, "Icosahedron", 20);
        int numberOfFaces = 0;
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String polyhedron = input.nextLine();
            numberOfFaces += regularPolyhedrons.get(polyhedron);
        }
        System.out.println(numberOfFaces);
    }
}
