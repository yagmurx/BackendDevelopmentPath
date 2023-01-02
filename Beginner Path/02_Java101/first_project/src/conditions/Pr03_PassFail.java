/**
 *  Basic Pass Fail Example
 *
 * @author: Yagmur Yildiz
 * @date: 2 January 2023
 */

package conditions;
import java.util.Scanner;
public class Pr03_PassFail {
    public static void main(String[] args) {
        int math, phy, eng, chem;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = input.nextInt();

        System.out.print("Physics Grade: ");
        phy = input.nextInt();

        System.out.print("English Grade: ");
        eng = input.nextInt();

        System.out.print("Chemistry Grade: ");
        chem = input.nextInt();

        double avr = (math + phy + eng + chem) /4;

        if (avr <= 55) {
            System.out.println("Failed");
            System.out.println("Average: " + avr);
        } else {
            System.out.println("Passed");
            System.out.println("Average: " + avr);
        }

    }
}
