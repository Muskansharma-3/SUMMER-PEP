// package PEP;
import java.util.Scanner;
public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A= sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();
        long D=sc.nextLong();
        long X=(A*B)-(C*D);
        System.out.println("Difference = "+X);
    }
}
