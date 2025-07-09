import java.util.Scanner;

public class maxNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long max=find(arr,0);
        System.out.println(max);
    }
    private static long find(long[] arr, int i){
        if(i==arr.length-1){
            return arr[i];
        }
        long max2=find(arr, i+1);
        return Math.max(max2,arr[i]);
    }
}
