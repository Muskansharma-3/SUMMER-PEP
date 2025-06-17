package PEP;
import java.util.Scanner;
public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A= sc.nextInt();
        long B=sc.nextInt();
        long C=sc.nextInt();
        long D=sc.nextInt();
        long res=(A*B)-(C*D);
        System.out.println("Difference = "+res);
    }
}
