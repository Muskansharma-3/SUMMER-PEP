import java.util.*;

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        int i=1;
        for(int j=1;j<n;j++){
            if(a[j]!=a[j-1]){
                a[i]=a[j];
                i++;
            }
        }
        System.out.println(i);
    }
}
