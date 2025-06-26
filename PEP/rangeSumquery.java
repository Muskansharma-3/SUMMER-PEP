import java.util.Scanner;

public class rangeSumquery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        long[] arr=new long[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=sc.nextLong();
        }
        
        long[] prefix=new long[N+1];
        for(int i=1;i<=N;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        while(Q-- > 0){
            int L =sc.nextInt();
            int R=sc.nextInt();
            System.out.println(prefix[R] - prefix[L - 1]);      
        }

    }
}
