import java.util.Scanner;

public class packingRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w=sc.nextLong();
        long h=sc.nextLong();
        long n=sc.nextLong();
        long low=1;
        long high=n*n;
        long ans=0;
        while(low<high){
            long mid=low+(high-low)/2;
            if((mid/w)*(mid/h)>=n){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }  
        System.out.println(ans);
    }
}
