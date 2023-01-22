/**
 * Write the program that finds out  the number is a "Prime" or not.
 * Number received from the user.
 * Use the recursive method.
 *
 * @author: Yagmur Yildiz
 * @date: 22 Jan 23
 */

package methods;
import java.util.Scanner;
public class Pr05_RecursivePrimeNum {

    static boolean primeNum(int num, int x) {
        if (num < 2)
            return false;

        else if (num == 2)
            return true;

        else if (num % x != 0 && x >= num - 1)
            return true;

        else {
            if (num % x == 0)
                return false;
            else
                return primeNum(num, x + 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int divisor = 2;

        if(primeNum(number, divisor))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
