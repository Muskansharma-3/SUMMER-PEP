import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char op = sc.next().charAt(0);
        int B = sc.nextInt();
        if(op=='+') System.out.println(A+B);
        else if(op=='-') System.out.println(A-B);
        else if(op=='*') System.out.println(A*B);
        else if(op=='/') System.out.println(A/B);
    }
}
