/**
 *  A program that sums odd numbers
 */


package loops;
import java.util.Scanner;
public class Pr02_AdditionLoop {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num%2 == 1)
                sum += num;
        } while(num > 0);

        System.out.println("Total: " + sum);
    }
}
