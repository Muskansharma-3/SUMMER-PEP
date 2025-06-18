import java.util.Scanner;
public class allNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        int positive=0;
        int negative=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                even++;
            } else {
                odd++;
            }
            if(arr[i]>0){
                positive++;
            } else if(arr[i]<0){
                negative++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
