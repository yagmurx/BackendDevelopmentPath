package Arrays;

public class Pr02_MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {64, 33, 99, 12, 20, -5, 4};

        int min = arr[0];
        int max = arr[0];

        for(int i: arr) {
            if(i < min)
                min = i;

            if(max < i)
                max = i;
        }

        System.out.println("Min: " + min + "\tMax: " + max);
    }
}
