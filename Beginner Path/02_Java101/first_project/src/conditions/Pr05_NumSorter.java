/**
 * Number sorter
 *
 * @author: Yagmur Yildiz
 * @date: 3 January 2023
 */

package conditions;
import java.util.Scanner;
public class Pr05_NumSorter {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first num: ");
        a = input.nextInt();
        System.out.print("Enter second num: ");
        b = input.nextInt();
        System.out.print("Enter third num: ");
        c = input.nextInt();

        if((a<c) && (a<b)) {
            if(c<b)
                System.out.println(a + "<" + c + "<" + b);
            else
                System.out.println(a + "<" + b + "<" + c);
        }
        else if ((b<a) && (b<c)) {
            if(a<c)
                System.out.println(b + "<" + a + "<" + c);
            else
                System.out.println(b + "<" + c + "<" + a);
        }
        else if ((c<a) && (c<b)) {
            if(a<b)
                System.out.println(c + "<" + a + "<" + b);
            else
                System.out.println(c + "<" + b + "<" + a);
        }
        else
            System.out.println("Some equal numbers");
    }
}
