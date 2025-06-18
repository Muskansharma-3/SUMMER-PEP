import java.util.Scanner;

public class firstdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int res=X/1000;
        if(res%2==0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
