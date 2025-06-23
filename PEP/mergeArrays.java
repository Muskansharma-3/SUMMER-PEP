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
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                res[k++]=a[i++];
            }else{
                res[k++]=b[j++];
            }
        }
        while(i<n) res[k++]=a[i++];
        while(j<m) res[k++]=b[j++];
        for(long num:res){
            System.out.print(num+" ");
        }
    }
}
