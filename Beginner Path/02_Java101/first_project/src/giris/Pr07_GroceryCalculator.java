/**
 *  A program that calculates grocery bill.
 *
 * @author: Yagmur Yildiz
 * @date: 25 December 2022
 */

package giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Pr07_GroceryCalculator {
    public static void main(String[] args) {
        //Variables
        float pear = 2.14F, apple = 3.67F, tomato=1.11F, banana=0.95F, aubergine=5F;
        float bill=0, weight=0;

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("How many kg of pear? ");
        weight = input.nextFloat();
        bill += weight*pear;

        System.out.print("How many kg of apple? ");
        weight = input.nextFloat();
        bill += weight*apple;

        System.out.print("How many kg of tomato? ");
        weight = input.nextFloat();
        bill += weight*tomato;

        System.out.print("How many kg of banana? ");
        weight = input.nextFloat();
        bill += weight*banana;

        System.out.print("How many kg of aubergine? ");
        weight = input.nextFloat();
        bill += weight*aubergine;


        //Output
        System.out.println("Total Bill: $" + bill);
    }
}
