package Arrays;

public class _03_ForEach {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        int sum = 0;

        for(int i:list) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Total= " + sum);

        String[] cars = {"BMW", "Mercedes", "Audi"};

        for(String str: cars) {
            System.out.println(str);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int[] row: matrix) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
