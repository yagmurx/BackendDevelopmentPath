/**
 *  A palindromic number is a number that remains the same when its digits are reversed.
 *
 * @author: Yagmur Yildiz
 * @date: 12 Jan '23
 */
package methods;
import java.util.Scanner;
public class Pr01_PalindromeNumbers {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNum = 0, lastDigit;

        while(temp != 0) {
            lastDigit = temp % 10;
            reverseNum = (reverseNum*10) + lastDigit;
            temp /= 10;
        }

        if(reverseNum == number)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(isPalindrome(num))
            System.out.println(num + " is Palindrome Number");
        else
            System.out.println(num + " is not Palindrome Number");
    }
}
