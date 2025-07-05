import java.util.Scanner;

public class theBoredBillionare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            int i=0;
            long low=0;
            long high=(long) Math.sqrt(2*N)+1;
            long res=0;
            while(low<=high){
                long mid=low+(high-low)/2;
                long total=(mid*(mid+1))/2;
                if(total<=N){
                    res=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            System.out.println(res);
        }
    }
}
