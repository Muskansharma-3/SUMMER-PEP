import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        // print yes if prime else print no
        if(X<2){
            System.out.println("NO");
        } else {
            boolean isPrime = true;
            for(int i=2; i*i<=X; i++) {
                if(X % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}
