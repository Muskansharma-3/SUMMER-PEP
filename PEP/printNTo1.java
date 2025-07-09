import java.util.Scanner;

public class printNTo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
    private static void print(int n){
        if(n==0) return;
        System.out.print(n);
        if(n>1) System.out.print(" ");
        print(n-1);
    }
}
