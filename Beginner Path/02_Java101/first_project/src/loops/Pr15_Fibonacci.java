/**
 * Fibonacci numbers
 *
 * @author: Yagmur Yildiz
 * @date: 10 Jan '23
 */

package loops;
import java.util.Scanner;
public class Pr15_Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum1 = 0, sum2 = 1, buff;

        System.out.print(num + " Elemanlı Fibonacci Serisi: ");
        System.out.print(sum1 + " " + sum2);

        for(int i=2; i<num; i++) {
            buff = sum1 + sum2;
            System.out.print(" " + buff);
            sum1 = sum2;
            sum2 = buff;
        }
    }
}
