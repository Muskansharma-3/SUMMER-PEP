import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] arr=new long[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLong();
        }
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        System.out.println(Math.abs(sum));
    }
}
