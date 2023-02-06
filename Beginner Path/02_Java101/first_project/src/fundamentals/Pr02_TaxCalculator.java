/**
 * A tax calculator program
 * that calculates the tax rate and the
 * price with tax when the price is entered.
 *
 * @author: Yağmur Yıldız
 * @date: 17 Dec 2022
 */

package variables;
import java.util.Scanner;

public class Pr02_TaxCalculator {
    public static void main(String[] args) {
        //Initiate variables
        float price, priceWithTax, taxAmount;
        float tax = 0.18F;

        //Initiate scanner
        Scanner input = new Scanner(System.in);

        //Get Price
        System.out.print("Please enter the price: ");
        price = input.nextFloat();

        taxAmount = price*tax;
        priceWithTax = price + taxAmount;
        System.out.println("Original Price: " + price + " Tax Amount: " + taxAmount + " Price with Tax: " + priceWithTax);
    }
}
