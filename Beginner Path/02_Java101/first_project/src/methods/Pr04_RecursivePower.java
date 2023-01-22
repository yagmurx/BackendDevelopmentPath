/**
 *  Write the program that performs the power of a number.
 *  The base and power values taken from the user.
 *  Use the recursive method.
 *
 * @author: Yagmur Yildiz
 * @date: 22 Jan 23
 */
package methods;
import java.util.Scanner;
public class Pr04_RecursivePower {
    static int power (int base, int power) {

        if(power != 0)
            return (base*power(base, power-1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the power: ");
        int pow = input.nextInt();

        int result = power(base, pow);
        System.out.println("Result: " + result);

    }
}
