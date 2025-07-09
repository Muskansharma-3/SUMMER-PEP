import java.util.*;
public class reachValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long n=sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    private static boolean check(long n){
        if(n==1) return true;
        if(n<1) return false;
        if(n%10==0 && check(n/10)) return true;
        if(n%20==0 && check(n/20)) return true;
        return false;
    }
}
