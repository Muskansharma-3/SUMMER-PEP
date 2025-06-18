import java.util.Scanner;
public class Char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);
        if(Character.isUpperCase(X)){
            System.out.println((char)(X+32));
        }else{
            System.out.println((char)(X-32));
        }
    }
}
