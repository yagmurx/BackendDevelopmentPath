/**
 *  A program that transposes nxm matrix.
 *
 * @author: Yagmur Yildiz
 * @date: 25 Jan '23
 */
package Arrays;

public class Pr07_Transpose {

    static void print(int[][] arr) {
        for(int[] row: arr) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4},
                {5, 6, 4}
        };
        System.out.println("Matrix: ");
        print(arr);

        int[][] transpose = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose: ");
        print(transpose);

    }
}
