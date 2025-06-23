import java.util.Scanner;

public class numberOfEqual {
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
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                int c1=1;
                int c2=1;
                i++;
                while(i<n && a[i]==a[i-1]){
                    c1++;
                    i++;
                }
                j++;
                while(j<m && b[j]==b[j-1]){
                    c2++;
                    j++;
                }
                count+=(c1*c2);
                
            }else if(a[i]<b[j]){
                i++;
                while(i<n && a[i]<b[j]) i++;
            }else{
                j++;
                while(j<m && a[i]>b[j]) j++;
            }
        }
        System.out.println(count);
    }
}
