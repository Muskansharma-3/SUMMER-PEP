import java.util.Scanner;

public class positionsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(arr[i]<=10){
                System.out.println("A["+i+"] = "+arr[i]);
            }
        }
    }
}
