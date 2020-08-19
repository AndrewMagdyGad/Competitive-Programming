/**
 * Online Judge: UVa.
 * Problem Code: UVA 12148.
 * Problem Name: Electricity.
 * Date : 11/01/2020.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA12148 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberOfDays, sum;
        while (n != 0) {
            numberOfDays = 0;
            sum = 0;
            int arr[][] = new int[n][4];
            for (int i = 0; i < n; i++) {
                arr[i][0] = input.nextInt();
                arr[i][1] = input.nextInt();
                arr[i][2] = input.nextInt();
                arr[i][3] = input.nextInt();
            }
            
            for (int i = 1; i < n; i++) {
                getNextDay(arr[i - 1]);
                if (arr[i - 1][2] == arr[i][2] && arr[i - 1][1] == arr[i][1] && arr[i - 1][0] == arr[i][0]) {
                    sum += arr[i][3] - arr[i - 1][3];
                    numberOfDays++;
                }
            }
            System.out.println(numberOfDays + " " + sum);
            n = input.nextInt();
        }
    }
    
    public static void getNextDay(int arr[]) {
        switch (arr[1]) {
            case 2:
                if (arr[0] == 29 && ((arr[2] % 4 == 0 && arr[2] % 100 != 0) || (arr[2] % 400 == 0))) {
                    arr[0] = 1;
                    arr[1] = 3;
                }
                else if (arr[0] == 28 && !((arr[2] % 4 == 0 && arr[2] % 100 != 0) || (arr[2] % 400 == 0))) {
                    arr[0] = 1;
                    arr[1] = 3;
                }
                else {
                    arr[0]++;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (arr[0] == 31) {
                    arr[0] = 1;
                    if (arr[1] == 12) {
                        arr[1] = 1;
                        arr[2]++;
                    }
                    else {
                        arr[1]++;
                    }
                }
                else {
                    arr[0]++;
                }
                break;
            default:
                if (arr[0] == 30) {
                    arr[0] = 1;
                    arr[1]++;
                }
                else {
                    arr[0]++;
                }
        }
    }
}
