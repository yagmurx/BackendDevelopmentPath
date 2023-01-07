/**
 *  A program that prints a crystal
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * @author: Yagmur Yildiz
 * @date: 7 January 2023
 *
 */


package loops;
import java.util.Scanner;
public class Pr08_PrintCrystal {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=(num-i); j++)
                System.out.print(" ");

            for(int j=1; j<=((2*i)-1); j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=num; i!=0; i--) {
            for(int j=1; j<=(num-i); j++)
                System.out.print(" ");

            for(int j=1; j<=((2*i)-1); j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
