import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();

        boolean result = false;

        if (S.equals(">")) {
            result = A > B;
        } else if (S.equals("<")) {
            result = A < B;
        } else if (S.equals("=")) {
            result = A == B;
        }

        System.out.println(result ? "Right" : "Wrong");
    }
}
