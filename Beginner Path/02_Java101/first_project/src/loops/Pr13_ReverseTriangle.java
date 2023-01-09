/**
 *  Print a reverse triangle
 * @author: Yagmur Yildiz
 * @date: 10 Jan '23
 */

package loops;

public class Pr13_ReverseTriangle {
    public static void main(String[] args) {
        int num = 10;

        for(int i=num; i!=0; i--) {
            for(int j=1; j<=(num-i); j++)
                System.out.print(" ");

            for(int j=1; j<=((2*i)-1); j++)
                System.out.print("*");

            System.out.println();
        }
    }


}
