import java.util.Scanner;

public class lotteryByTheSea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int sum=0;
        int max=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(sum>m){
                sum-=arr[i];
                i++;
            }
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);
    }
}
