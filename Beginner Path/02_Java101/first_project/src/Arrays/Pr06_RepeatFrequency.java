/**
 * A program that counts frequencies of the numbers the array.
 * EX: array is [10, 20, 20, 10, 10, 20, 5, 20]
 * OUTPUT:
 * 10 is repeated 3th times.
 * 20 is repeated 4th times.
 * 5 is repeated 1th times.
 *
 * @author: Yagmur Yildiz
 * @date: 25 Jan '23
 */

package Arrays;

public class Pr06_RepeatFrequency {
    static boolean memory (int[] arr, int val) {
        for(int i: arr) {
            if(i == val)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] mem = new int[arr.length];
        int memIndex = 0;

        for(int i=0; i<arr.length; i++){
            if(!memory(mem, arr[i])) {
                int count = 1;
                for(int j=0; j<arr.length; j++) {

                    if( (i != j) && (arr[i] == arr[j])) {
                        mem[memIndex++] = arr[i];
                        count++;
                    }
                }

                System.out.println(arr[i] + " is repeated " + count + "th times.");
            }
        }
    }
}
