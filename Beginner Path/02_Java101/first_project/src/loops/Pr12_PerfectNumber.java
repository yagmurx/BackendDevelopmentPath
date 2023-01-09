/**
 * Write in Java the program that finds out whether a number
 * entered on the keyboard is the perfect number or not.
 *
 * @author: Yagmur Yildiz
 * @date: 10 Jan '23
 */

package loops;
import java.util.Scanner;
public class Pr12_PerfectNumber {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        //Find divisors and sum
        for(int i=1; i<num; i++) {
            if(num%i == 0)
                sum += i;
        }

        if(num == sum)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
    }
}
