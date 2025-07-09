import java.util.Scanner;

public class arrayAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long sum=find(arr,0);
        double average=(double)sum/n;
        System.out.printf("%.6f",average);
    }
    private static long find(long[] arr, int i){
        if(i==arr.length) return 0;
        return arr[i]+find(arr, i+1);
    }
}
