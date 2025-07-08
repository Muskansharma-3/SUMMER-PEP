import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }
    private static long print(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        long ans=0;
        for(int i=1;i<=6;i++){
            ans+=print(n-i);
        }
        return ans;
        // return(print(n-1)+print(n-2)+print(n-3)+print(n-4)+print(n-5)+print(n-6));
    }
}
