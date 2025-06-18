import java.util.Scanner;

public class floorCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double result = (double) A / B;

        System.out.println("floor " + A + " / " + B + " = " + (int)Math.floor(result));
        System.out.println("ceil " + A + " / " + B + " = " + (int)Math.ceil(result));
        System.out.println("round " + A + " / " + B + " = " + Math.round(result));
    }
}
