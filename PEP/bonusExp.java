import java.util.Scanner;

public class bonusExp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(find(arr,0,n, 0));
    }
    private static int find(long[] arr, int i, int n, int count){
        if(i>=n) return 0;
        int nottake=find(arr,i+1,n,count);
        int take=Integer.MIN_VALUE;
        if(count%2==0){
            take=(int)arr[i]+find(arr,i+1,n, count+1);
        }else{
            take=(int)(arr[i]+arr[i]+find(arr,i+1,n, count+1));
        }
        return Math.max(take, nottake)
;    }
}
