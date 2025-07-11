import java.util.*;

public class bonusExp {
    static int[][]dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(find(arr,0,n, 0));
    }
    private static int find(long[] arr, int i, int n, int count){
        if(i>=n) return 0;
        if(dp[i][count]!=-1) return dp[i][count];
        int nottake=find(arr,i+1,n,count);
        int take=Integer.MIN_VALUE;
        if(count%2==0){
            take=(int)arr[i]+find(arr,i+1,n, 1);
        }else{
            take=(int)(arr[i]+arr[i]+find(arr,i+1,n, 0));
        }
        dp[i][count]=Math.max(take, nottake);
        return dp[i][count];
    }
}
