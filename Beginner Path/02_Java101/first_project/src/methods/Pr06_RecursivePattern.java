/**
 *  Make a function that get numbers according to following pattern.
 *      - For the number is not equal or smaller than zero, substract 5.
 *      - When it becomes to zero or negative, add 5 until get the original number.
 *      - Print number at every step.
 *      - Use recursive method.
 *
 * Exp: 20 15 10 5 0 5 10 15 20
 *
 * @author: Yagmur Yildiz
 * @date: 22 Jan 23
 */

package methods;
import java.util.Scanner;
public class Pr06_RecursivePattern {

    static void pattern(int num, int count, boolean flag) {
        if(num <= 0)
            flag = false;

        if(num > 0 && flag) {
            System.out.print(num + " ");
            pattern(num-5, ++count, flag);
        }
        else {
            System.out.print(num + " ");
            if(count == 0)
                return;
            pattern(num+5, --count, flag);
        }
    }
    static void pattern(int number) {
        pattern(number, 0, true);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        pattern(number);
    }
}
