import java.util.Scanner;

public class MemoMomo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        if(k%a==0 && k%b==0){
            System.out.println("Both");
        } else if(k%a==0) {
            System.out.println("Memo");
        } else if(k%b==0) {
            System.out.println("Momo");
        } else {
            System.out.println("No one");
        }
            
    }
}
