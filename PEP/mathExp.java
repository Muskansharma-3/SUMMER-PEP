import java.util.Scanner;

public class mathExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();
        String Q = sc.next(); // Will always be "="
        int C = sc.nextInt();

        int result = 0;

        if (S.equals("+")) {
            result = A + B;
        } else if (S.equals("-")) {
            result = A - B;
        } else if (S.equals("*")) {
            result = A * B;
        }

        if (result == C) {
            System.out.println("Yes");
        } else {
            System.out.println(result);
        }
    }
}
