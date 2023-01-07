package loops;

public class _01_While {
    public static void main(String[] args) {
        int a = 1;

        while(a < 4) {
            System.out.print(a + " ");
            a++;
        }

        int left = 100, right = 200;

        while(++left < --right);
        System.out.println(left);
    }
}
