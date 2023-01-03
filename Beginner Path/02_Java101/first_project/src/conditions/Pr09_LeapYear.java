/**
 * Leap Year Calculator
 *
 * @author: Yagmur Yildiz
 * @date: 3 January 2023
 */

package conditions;
import java.util.Scanner;
public class Pr09_LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();

        if(year%4 == 0)
            System.out.println(year + " is a leap year");
        else if (year%400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
