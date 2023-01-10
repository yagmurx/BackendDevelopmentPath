package methods;

public class _01_Methods {


    static int power(int base, int exp) {
        int result = 1;
        for(int i=1; i<=exp; i++)
            result *=base;

        return result;
    }
    public static void main(String[] args) {
        int num1 = power(2, 3);
        System.out.println(num1);
    }
}
