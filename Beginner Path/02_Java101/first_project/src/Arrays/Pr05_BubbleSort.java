/**
 *  Bubble sort algorithm with Java
 *
 * @author: Yagmur Yildiz
 * @date: 25 Jan '23
 */

package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Pr05_BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Element number of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print((i+1) + ". th Element: ");
            arr[i] = input.nextInt();
        }

        int buff = 0;

        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    buff = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buff;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
