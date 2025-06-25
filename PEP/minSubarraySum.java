import java.util.Scanner;
public class minSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long sum=0;
        long min=Integer.MAX_VALUE;
        for(long num:a){
            sum+=num;
            min=Math.min(min, sum);
            if(sum>0) sum=0;
        }
        System.out.println(min);
    }
}
