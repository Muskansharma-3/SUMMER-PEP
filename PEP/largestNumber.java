import java.util.Scanner;

public class largestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String[] brr=new String[n];
        for(int i=0;i<n;i++){
            brr[i]=String.valueOf(arr[i]);
        }
        
    }
}