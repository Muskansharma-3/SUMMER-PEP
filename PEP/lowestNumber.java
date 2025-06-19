import java.util.*;
public class lowestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int pos=1;
        for(int i=1;i<N;i++){
            if(arr[i]<min){
                min=arr[i];
                pos=i+1;
            }
        }
         System.out.println(min+" "+pos);
    }
}
