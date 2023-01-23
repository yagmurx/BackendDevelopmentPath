package Arrays;

public class _01_Arrays {

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++)
        System.out.println(array[i] + " ");
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for(int i=0, j = result.length-1; i<array.length;i++, j--)
            result[j] = array[i];

        return result;
    }
    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0] = 1.1;
        System.out.println(arr[0]);

        String[] days = {"Monday", "Tuesday", "Wednesday"};
        System.out.println(days[2]);
        days[2] = "Sunday";
        System.out.println(days[2]);

    }
}
