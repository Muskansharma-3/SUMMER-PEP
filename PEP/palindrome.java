import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        // Print N in a reversed order and not leading zeroes.
        // yes if palindrome no if not
        int num=N;
        int rev=0;
        while(N!=0){
            int ld=N%10;
            rev=(rev*10)+ld;
            N/=10;
        }
        System.out.println(rev);
        if(rev==num){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
 
    }
}
