import java.util.Scanner;

public class closestToTheLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long[] que=new long[k];
        for(int i=0;i<k;i++){
            que[i]=sc.nextLong();
        }
          

    }
}
