import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] arr=new long[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextLong();
        }
        long X=sc.nextLong();
        boolean found=false;
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                System.out.println(i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}
