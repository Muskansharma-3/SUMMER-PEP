import java.util.Scanner;

public class maxInSubarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n-k;i++){
            int max=arr[i];
            for(int j=1;i<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.println(max+" ");
        }
        
    }
}