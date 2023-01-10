package methods;

public class _02_MethodOverloading {

    static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static float sum(float num1, float num2) {
        float result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(1.5F, 4F));
    }
}
