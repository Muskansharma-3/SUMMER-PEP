import java.util.Scanner;

public class timonPumbaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=a-b;
        if(diff>0){
            System.out.println(diff);
        }else{
            System.out.println(0);
        }
    }
}
