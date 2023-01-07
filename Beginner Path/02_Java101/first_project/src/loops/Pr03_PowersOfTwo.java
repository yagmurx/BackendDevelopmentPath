/**
 * A program that finds the powers of two
 */
package loops;
import java.util.Scanner;
public class Pr03_PowersOfTwo {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for(int i=1; i<=num; i*=2) {
            System.out.println(i);
        }

    }
}
