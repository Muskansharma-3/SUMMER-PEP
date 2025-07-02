import java.util.Scanner;

public class closestToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int q=0;q<k;q++){
            long x=sc.nextLong();
            int left=0;
            int right=n-1;
            int ans=n;
            while(left<=right) {
                int mid=(left+right)/2;
                if(arr[mid]>=x){
                    ans=mid;
                    right=mid-1;
                }else{
                    left=mid+1;;
                }
            }
            System.out.println(ans+1);
        }
        }
}
