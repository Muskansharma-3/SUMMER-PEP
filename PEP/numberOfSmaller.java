import java.util.Scanner;

public class numberOfSmaller {
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

        // brute force -> n*m
        // for(int j=0;j<m;j++){
        //     int count=0;
        //     for(int i=0;i<n;i++){
        //         if(a[i]<b[j]) count++;
        //     }
        //     System.out.print(count+" ");
        // }


        //optimised
        int i=0;
        int count=0;
        for(int j=0;j<m;j++){
            while(i<n){
                if(a[i]<b[j]) count++;
                else break;
                i++;
            }
            System.out.print(count+" ");
        }

    }
}
