import java.util.*;

public class apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long k=sc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long[] b=new long[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long count=0; 
        int i=0, j=0;
        while(i<n && j<m){
            if(a[i]-k<=b[j] && a[i]+k>=b[j]){
                count++;
                i++;
                j++;
            } else if(a[i] - k > b[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
