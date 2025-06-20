import java.util.Scanner;

public class squareOrRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(w==h){
                System.out.println("Square");
            }else{
                System.out.println("Rectangle");
            }
        }
    }
}
