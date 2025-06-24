import java.util.Scanner;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] res=new int[n-k+1];
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=a[i];
        }
        res[0]=windowSum;
        for(int i=k;i<n;i++){
            windowSum=windowSum-a[i-k]+a[i];
            res[i-k+1]=windowSum;
        }
        for(int i=0;i<n-k+1;i++){
            System.out.print(res[i]+" ");
        }       
    }
}
