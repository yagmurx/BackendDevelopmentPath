/**
 * Program that calculate the cab price based on the distance entered.
 * Opening Fee = $10, price per km = $2.20
 * @author: Yagmur Yildiz
 * @date: 25 December 2022
 */

package variables;
import java.util.Scanner;

public class Pr04_CabPriceCalculator {
    public static void main(String[] args) {
        // Variables
        float distance = 0 ,price = 0, pricePerKm = 2.20F, openFee = 10F;

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance as km: ");
        distance = input.nextFloat();

        //Calculation
        price = openFee + (distance*pricePerKm);
        price = (price < 20) ? 20 : price;

        // Output
        System.out.println("Price = " + price);
    }
}
