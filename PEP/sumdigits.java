import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();           // Read number of digits
        String digits = sc.next();      // Read the digits as a string

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += digits.charAt(i) - '0';  // Convert char digit to int and add
        }

        System.out.println(sum);

        
    }
}
