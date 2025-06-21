import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
    static int fib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}