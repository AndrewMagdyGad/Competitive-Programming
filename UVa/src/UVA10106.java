/**
 * Online Judge: UVa.
 * Problem Code: UVA 10106.
 * Problem Name: Product.
 * Date : 25/12/2019.
 * @author Andrew
 */
import java.util.Scanner;

public class UVA10106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer, n1, n2, temp;
        char[] array1;
        
        while (input.hasNext()) {
            answer = "";
            n1 = input.nextLine();
            n2 = input.nextLine();
            
            if (n1.equals("0") || n2.equals("0")) {
                System.out.println("0");
                continue;
            }
            
            array1 = n1.toCharArray();
            for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
                temp = multiplyCharByString(array1[i], n2);
                for (int k = 0; k < j; k++)
                    temp += "0";
                answer = addTwoStrings(answer, temp);
            }
            
            System.out.println(answer);
        }
    }
    
    public static String multiplyCharByString(char number1, String number2) {
        String answer = "";
        int carry = 0, temp;
        char[] array1 = number2.toCharArray();
        for (int i = array1.length - 1; i >= 0; i--) {
            temp = (array1[i] - '0') * (number1 - '0') + carry;
            answer = temp % 10 + answer;
            carry = temp / 10;
        }
        if (carry > 0)
           answer = carry + answer;
        
        return answer;
    }
    
    /**
    * This method is used to add two strings
    * @param number1 the first string to add
    * @param number2 the second string to add
    * @return the summation of the two strings
    */
    public static String addTwoStrings(String number1, String number2) {
        String answer = "";
        char[] array1, array2;
        int carry, sum;
        
        while (number1.length() < number2.length())
            number1 = "0" + number1;
        while (number2.length() < number1.length())
            number2 = "0" + number2;
        
        array1 = number1.toCharArray();
        array2 = number2.toCharArray();
        carry = 0;
        
        for (int i = array1.length - 1; i >= 0; i--) {
            sum = array1[i] - '0' + array2[i] - '0' + carry;
            answer = sum % 10 + answer;
            carry = sum / 10;
        }
        if (carry > 0)
            answer = carry + answer;
        
        return answer;
    }
}
