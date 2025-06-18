import java.util.Scanner;

public class capitalSmallDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char X= sc.next().charAt(0);
        if(Character.isDigit(X)){
            System.out.println("IS DIGIT");
        }else{
            System.out.println("ALPHA");
            if(Character.isUpperCase(X)){
                System.out.println("IS CAPITAL");
            }else{
                System.out.println("IS SMALL");
            }
    }
}}
