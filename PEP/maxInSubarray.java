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
        int max=0;
        int[] res=new int[n-k+1];
        for(int i=0;i<k;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        res[0]=max;
        for(int i=k;i<n;i++){
            if(arr[i]>max){
                res[i-k+1]=arr[i];
            }else{
                res[i-k+1]=max;
            }
            
        }
        for(int i=0;i<n-k+1;i++){
            System.out.print(res[i]+ " ");
        }
    }
}