
import java.util.*;

public class targetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        // not for unique for pairs
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int newTarget=target-arr[i];
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]==newTarget){
        //             count++;
        //         }
        //     }
        // }

        // for unique value pairs -> two pointer technique
        Arrays.sort(arr);
        int count=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                int val1=arr[left];
                int val2=arr[right];
                while(left<right && arr[left]==val1) left++;
                while(left<right && arr[right]==val2) right--;
            }
            else if(sum<target) left++;
            else right--;
        }
        System.out.println(count);
    }
}
