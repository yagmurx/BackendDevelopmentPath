package Arrays;

public class Pr01_AverageofArray {
    public static void main(String[] args) {
        int[] arr = {15, 23, 17, 8, 11, 3};
        double average = 0.0;
        int sum = 0;

        for(int i: arr) {
            sum += i;
        }
        average = sum/arr.length;
        System.out.println(average);
    }
}
