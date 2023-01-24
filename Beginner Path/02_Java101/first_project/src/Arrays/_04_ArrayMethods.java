package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_ArrayMethods {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};

        //%%%%%%%% Print an array %%%%%%%%
        System.out.println(Arrays.toString(list));

        //%%%%%%%% Change elements mass %%%%%%%%
        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));

        //%%%%%%%% Change elements with indexes %%%%%%%%
        Arrays.fill(list, 2,4, 20);
        System.out.println(Arrays.toString(list));

        //%%%%%%%% SORT %%%%%%%%
        int[] list2 = {-3, -5, 2, 0, 12, -12, 45};
        System.out.println(Arrays.toString(list2));
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        //%%%%%%%% Binary Search %%%%%%%%
        System.out.println(Arrays.binarySearch(list2, 12));

        //%%%%%%%% Copy %%%%%%%%
        int[] copyList = Arrays.copyOf(list2, 4);
        System.out.println(Arrays.toString(copyList));

        //%%%%%%%% Copy in a range %%%%%%%%
        int[] rangeList = Arrays.copyOfRange(list2, 2, 5);
        System.out.println(Arrays.toString(rangeList));
    }
}
