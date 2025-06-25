import java.util.Scanner;

public class circularSubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int total=0;
        int max=a[0];
        int min=a[0];
        int currMax=0;
        int currMin=0;
        for(int num:a){
            total+=num;
            currMax=Math.max(currMax+num, num);
            max=Math.max(max, currMax);
            currMin=Math.min(currMin+num, num);
            min=Math.min(min, currMin);
        }
        int cSum=total-min;
        if(max<0) System.out.println(max);
        else System.out.println(Math.max(max, cSum));
    }
}
