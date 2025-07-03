import java.util.Scanner;

public class veryEasyTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        if (n==1) {
            System.out.println(Math.min(x, y));
            return;
        }
        int first=Math.min(x, y);
        n--;
        long low=0, high=1L*n*Math.max(x, y), ans=0;
        while (low<=high) {
            long mid=(low+high)/2;
            long total=(mid/x)+(mid/y);
            if (total>=n) {
                ans=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        System.out.println(ans+first);
    }
}
