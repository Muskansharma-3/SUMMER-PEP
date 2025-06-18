// package PEP;
import java.util.Scanner;
public class digitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int n1=N%10;
        int n2=M%10;
        System.out.println(n1+n2);
    }
}
