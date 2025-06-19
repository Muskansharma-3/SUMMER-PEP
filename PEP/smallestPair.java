import java.util.Scanner;

public class smallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<N;i++){
                for(int j=i+1;j<N;j++){
                    int sum=arr[i]+arr[j]+j-i;
                    if(sum<min){
                        min=sum;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
