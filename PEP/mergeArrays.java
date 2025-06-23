import java.util.Scanner;

public class mergeArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long[] b=new long[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextLong();
        }
        long[] res=new long[n+m];
        int i=n-1;
        int j=m-1;
        int k=m+n-1;
        while(j>=0 && i>=0){
            if(a[i]>b[j]){
                res[k--]=a[i--];
            }else{
                res[k--]=b[j--];
            }
        }
        while(i>=0) res[k--]=a[i--];
        while(j>=0) res[k--]=b[j--];
        for(long num:res){
            System.out.print(num+" ");
        }
    }
}
