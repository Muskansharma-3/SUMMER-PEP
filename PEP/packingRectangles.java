import java.util.Scanner;

public class packingRectangles {
    public static boolean check(long x, long w, long h, long n){
        return (x/w)*(x/h)>=n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w=sc.nextLong();
        long h=sc.nextLong();
        long n=sc.nextLong();
        long low=0;
        long high=1;
        while(!check(high,w,h,n)) high*=2;
        while(high-low>1){
            long mid=(low+high)>>1;
            if(check(mid, w, h, n)){
                high=mid;
            }else{
                low=mid;
            }
        }  
        System.out.println(high);
    }
}
