import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
        // print -1 if no even
        if(N < 2) {
            System.out.println(-1);
        }
        
    }
}
