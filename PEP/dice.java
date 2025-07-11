import java.util.*;

public class dice {
    static final int MOD=1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i-j>=0){
                    dp[i]=(dp[i]+dp[i-j])%MOD;
                }
            }
        }
        System.out.println(dp[n]);
    }
    // private static int print(int n){
    //     if(n==0) return 1;
    //     if(n<0) return 0;
    //     long ans=0;
    //     if(arr[n]!=-1) return arr[n];
    //     for(int i=1;i<=6;i++){
    //         ans+=print(n-i)%MOD;
    //     }
    //     arr[n]=(int)ans;
    //     return arr[n];
    //     // return(print(n-1)+print(n-2)+print(n-3)+print(n-4)+print(n-5)+print(n-6));
    // }
}
