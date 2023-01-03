/**
 *  Flight Ticket Calculator
 *
 * @author: Yagmur Yıldız
 * @date: 3 January 2023
 */

package conditions;
import java.util.Scanner;

public class Pr07_FlightTicket {
    public static void main(String[] args) {
        int distance, age, trip;
        float price = 0F;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance: ");
        distance = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Select trip type (1-> One Way, 2-> Return): ");
        trip = input.nextInt();


        // calculate raw price
        if(distance < 0)
            System.out.println("Missing Information");
        else
            price = distance*0.10F;

        // calculate age discount
        if((age>=0) && (age<12))
            price -= price*0.50F;
        else if ((age>=12) && (age<=24))
            price -= price*0.10F;
        else if ((age>24) && (age<65))
            price = price;
        else if ((age>=65))
            price -= price*0.30F;
        else
            System.out.println("Missing Information");

        //calculate return discount
        if(trip == 2)
            price = (price - price*0.20F)*2F;
        else
            System.out.println("Missing Information");


        System.out.println("Total Price: $" + price);
    }
}
