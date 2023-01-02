/**
 *  Outdoor Activity Recommender
 *
 * @author: Yagmur Yildiz
 * @date: 2 January 2023
 */
package conditions;
import java.util.Scanner;
public class Pr04_ActivityRecommend {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many degrees the weather is: ");
        heat = input.nextInt();

        if( heat < 5) {
            System.out.println("Skiing");
        }
        else if (heat>=5 && heat<=25) {
            if(heat<=15)
            {
                System.out.println("Cinema");
            }
            if(heat>=10) {
                System.out.println("Picnic");
            }
        }
        else if (heat>25) {
            System.out.println("Swimming");
        }
    }
}
