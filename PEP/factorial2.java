import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    private static long factorial(int n){
        if(n==0 || n==1) return 1;
        long res=n*factorial(n-1);
        return res;
    }
}
