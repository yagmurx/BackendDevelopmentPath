package giris;

public class _03_operators {
    public static void main(String[] args) {
        //Math Operators
        int a=5, b = 1;
        System.out.println(a+b);

        //Assignment Operators
        a = 10;
        b = 20;
        System.out.println(b);
        b += a;
        System.out.println(b);

        //Comparison Operators
        boolean status = a == b;
        System.out.println(status);
        status = a != b;
        System.out.println(status);

        //Logic Operators
        int n1 = 4, n2 = 4, n5 = 8;
        boolean comp1 = n1 == n2;
        boolean comp2 = n1 <= n5;
        boolean result = comp1 & comp2;
        System.out.println(result);
    }
}
