// package PEP;
import java.util.Scanner;
public class digitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long M=sc.nextLong();
        int n1=(int)(N%10);
        int n2=(int)(M%10);
        System.out.println(n1+n2);
    }
}
