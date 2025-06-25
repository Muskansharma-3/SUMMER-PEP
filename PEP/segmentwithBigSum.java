import java.util.Scanner;

public class segmentwithBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long s=sc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long sum=0;
        long min=Integer.MAX_VALUE;
        int i=0;
        for(int j=0;j<n;j++){
            sum+=a[j];
            while(sum>=s){
                if(j-i+1<min) min=j-i+1;
                sum-=a[i];
                i++;
            }
        }
        if(min==Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }   
    }
}
