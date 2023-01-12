/**
 * In mathematics, the Fibonacci numbers in which each number is the sum of the two preceding ones.
 *
 * @author: Yagmur Yildiz
 * @date: 12 Jan '23
 */
package methods;
public class Pr02_RecursiveFibonacci {

    static int Fibonacci(int num) {

        if(num == 1 ||num == 2)
            return 1;

        return Fibonacci(num-1) + Fibonacci(num-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(6));

    }
}
