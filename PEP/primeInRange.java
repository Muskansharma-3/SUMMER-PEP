import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
    }
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
}
