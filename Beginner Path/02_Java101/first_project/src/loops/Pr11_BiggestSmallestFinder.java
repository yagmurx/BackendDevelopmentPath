/**
 * Write the program that finds the largest and smallest numbers from the N-counting numbers
 * entered on the keyboard with Java and writes these numbers on the screen.
 *
 * @author: Yagmur Yildiz
 * @date: 9 Jan '23
 */

package loops;
import java.util.Scanner;
public class Pr11_BiggestSmallestFinder {
    public static void main(String[] args) {
        int n=0, small=0, big=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number will you enter: ");
        n = input.nextInt();

        int num[] = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter " + (i+1) + ". number: ");
            num[i] = input.nextInt();
        }

        // ============ FIND THE SMALLEST NUM
        small =num[0];
        for(int i=0; i<n; i++) {
            if(num[i] < small)
                small = num[i];
        }

        // ============ FIND THE BIGGEST NUM
        big = num[0];
        for(int i=0; i<n; i++) {
            if(big < num[i])
                big = num[i];
        }

        System.out.println("Smallest: " + small);
        System.out.println("Biggest: " + big);
    }
}
