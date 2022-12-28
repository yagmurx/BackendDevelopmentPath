package conditions;

public class _01_ConditionsIF {
    public static void main(String[] args) {
        int a = 10, b= 20, c = 5;

        if((a < b) && (a < c)) {
            System.out.println("Smallest number is a");
        }
        else if ((b < a) && (b < a)) {
            System.out.println("Smallest number is b");
        }
        else if((c < a) && (c < b)) {
            System.out.println("Smallest number is c");
        }
        else {
            System.out.println("There isn't one smallest number");
        }
    }
}
