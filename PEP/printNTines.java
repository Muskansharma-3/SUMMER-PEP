import java.util.Scanner;

public class printNTines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        print(N);
    }
    private static void print(int N){
        if(N==0) return;
        System.out.println("I love Recursion");
        print(N-1);
    }
}
