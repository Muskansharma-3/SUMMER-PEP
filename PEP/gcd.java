import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        while(B!=0){
            int temp=B;
            B=A%B;
            A=temp;
        }
        System.out.println(Math.abs(A));
    }
}
