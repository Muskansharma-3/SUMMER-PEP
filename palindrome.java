import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int digit;
        while(n > 0){
            digit = n % 10;
            sum = (sum * 10) + digit;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println(temp + " is a palindrome number");
        }
        else{
            System.out.println(temp + " is not a palindrome number");
        }
        sc.close();
    }
}
