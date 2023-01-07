/**
 * A program that separates even and odd numbers
 */

package loops;
import java.util.Scanner;

public class Pr01_EvenOddNumbers {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

// ============= With For Loop =============
        //Even numbers
        System.out.println("Even Numbers with For Loop");
        for(int i=1; i<=num; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }

        //Odd numbers
        System.out.println("Odd Numbers with For Loop");
        for(int i=1; i<=num; i++) {
            if(i%2 != 0)
                System.out.println(i);
        }

// ============= With While Loop =============
        int counter=1;
        //Even numbers
        System.out.println("Even Numbers with While Loop");
        while(counter <= num) {
            if(counter%2 == 0)
                System.out.println(counter);

            counter++;
        }

        counter=1;
        //Odd numbers
        System.out.println("Odd Numbers with While Loop");
        while(counter <= num) {
            if(counter%2 != 0)
                System.out.println(counter);

            counter++;
        }
    }
}
