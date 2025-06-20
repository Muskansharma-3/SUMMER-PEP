import java.util.Scanner;

public class winterSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double P = sc.nextDouble();

        double original = P / (1 - X / 100.0);

        System.out.printf("%.2f\n", original);
    }
}
