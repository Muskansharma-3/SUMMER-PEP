import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] arr = new int[T];
        for(int i=0; i<T; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<T; i++) {
            int N = arr[i];
            long fact = 1;
            for(int j=1; j<=N; j++) {
                fact *= j;
            }
            System.out.println(fact);
        }

    }
}
