/**
 *  A program that finds the Greatest Common Divisor (GCD) and
 *  the Least Common Multiple (LCM).
 *
 * @author: Yagmur Yildiz
 * @date: 9 Jan '23
 */

package loops;
import java.util.Scanner;

public class Pr10_GCD_LCM_Finder {
    public static void main(String[] args) {
        int num1, num2;
        int gcd=0, lcm=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        // Make num1 the smallest one.
        int buff;
        if(num2 < num1) {
            buff = num1;
            num1 = num2;
            num2 = buff;
        }

        for(int i=1; i<=num1; i++) {
            if(num1%i == 0 && num2%i == 0) {
                gcd = i;
            }

        }

        for(int i=1; i <= (num1*num2); i++) {
            if((i%num1==0) && (i%num2==0)) {
                lcm = i;
                break;
            }
        }

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);


    }
}
