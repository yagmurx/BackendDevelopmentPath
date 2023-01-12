/**
 * Calculator with methods
 *
 * @author: Yagmur Yildiz
 * @date: 12 Jan '23
 */

package methods;
import java.util.Scanner;

public class Pr03_Calculator {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println(a + "+" + b +"=" + result);
        return result;
    }
    static int sub(int a, int b) {
        int result = a - b;
        System.out.println(a + "-" + b +"=" + result);
        return result;
    }
    static int mult(int a, int b) {
        int result = a * b;
        System.out.println(a + "x" + b +"=" + result);
        return result;
    }
    static int div(int a, int b) {
        int result = a / b;
        System.out.println(a + "/" + b +"=" + result);
        return result;
    }
    static int pow(int a, int b) {
        int result = 1;
        for(int i=1; i<=b; i++)
            result *= a;

        System.out.println(a + "^" + b +"=" + result);
        return result;
    }

    static int fact(int a) {
        int result = 1;
        for(int i=1; i<=a; i++) {
            result *= i;
        }
        System.out.println(a + "! = " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = 0;
        result = a % b;
        System.out.println(a + "%" + b + "=" + result);
        return result;
    }
    static void rect(int a, int b) {
        System.out.println("Rectangle Peripheral= " + (2*(a+b)) + "\nRectangle Area= " + (a*b));
    }
    public static void main(String[] args) {

        String menu =   "1- Addition\n" +
                        "2- Subtraction\n" +
                        "3- Multiplication\n" +
                        "4- Division\n" +
                        "5- Power\n" +
                        "6- Factorial\n" +
                        "7- Mod\n" +
                        "8- Rectangle Peripheral & Area" +
                        "0- Quit ";
        Scanner input = new Scanner(System.in);
        int select;
        while(true) {
            System.out.println(menu);
            System.out.print("Select a function: ");
            select = input.nextInt();
            if(select == 0)
                break;

            System.out.print("Enter number a: ");
            int a = input.nextInt();
            System.out.print("b: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mult(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 5:
                    pow(a, b);
                    break;
                case 6:
                    fact(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rect(a, b);
                    break;
            }
        }
    }
}
